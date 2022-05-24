package com.demo;

import java.time.LocalTime;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Future를 사용하지 않고 BlockingQueue를 이용하여 결과를 받을 수 있습니다. 
 * BlockingQueue는 동시성을 보장하기 때문에 멀티쓰레드에서 접근해도 문제가 없습니다
 * 
 * 아래 예제에서는 Callable을 사용하지 않고 Runnable을 사용합니다. 
 * Task는 결과를 리턴할 필요가 없기 때문입니다.
 * 
 * 그리고 Task 0은 10초를 sleep하고, Task9는 1초를 sleep하도록 하였습니다. 
 * 이처럼 먼저 수행되는 Task가 더 오래 걸리도록 만들었습니다. 
 * 이렇게 하는 이유는 Task가 완료되는 순서대로 결과를 처리할 수 있다는 것을 보여주기 위해서입니다.
 * 
 * @author JH1025
 *
 */
public class FixedSizeThreadPoolExecutorTest4 {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        final BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        for (int i = 0; i < 10; i++) {
            final int jobId = i;
            final int sleepSec = 10 - i;
            System.out.println(LocalTime.now() + " Execute task " + jobId);

            // Result를 BlockingQueue에 저장합니다.
            executor.submit(() -> {
                System.out.println(LocalTime.now() + " Doing Task " + jobId + ", sleepSec: " + sleepSec);
                try {
                    TimeUnit.SECONDS.sleep(sleepSec);
                    String result = "finished job " + jobId;
                    queue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // take()는 Queue에 아이템이 추가될 때까지 기다렸다가 리턴합니다.
        for (int i = 0; i < 10; i++) {
            String result = queue.take();
            System.out.println(LocalTime.now() + " " + result);
        }

        executor.shutdown();
	}
}
