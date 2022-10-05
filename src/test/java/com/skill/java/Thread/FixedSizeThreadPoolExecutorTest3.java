package com.skill.java.Thread;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FixedSizeThreadPoolExecutorTest3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        final List<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            final int jobId = i;
            System.out.println(LocalTime.now() + " Execute task " + jobId);

            // submit()은 인자로 Callable도 받으며 Future를 리턴합니다.
            Future<String> result = executor.submit(() -> {
                TimeUnit.SECONDS.sleep(2);
                System.out.println(LocalTime.now() + " Done task " + jobId);
                return "finished job " + jobId;
            });
            futures.add(result);
        }

        // future.get()은 Task의 result가 리턴될 때까지 기다립니다.
        for (Future<String> future : futures) {
            String result = future.get();
            System.out.println(LocalTime.now() + " " + result);
        }

        executor.shutdown();
		
	}
}
