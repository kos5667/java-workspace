package com.skill.java.Thread;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * execute()로 Task를 예약할 수 있으며 쓰레드풀의 여유가 있을 때 Task를 수행합니다.
 * 인자로 Runnable을 구현한 객체를 전달할 수 있으며, 익명클래스나, 람다식으로 전달할 수도 있습니다.
 * 
 * shutdown()를 호출하면 더 이상 Task를 받지 않습니다. 처리중인 Task를 모두 완료한 뒤 쓰레드풀을 종료합니다.
 * 
 * shutdown()을 호출하면 더 이상 Task를 받지 않습니다. 
 * 하지만 이전에 추가된 Task는 수행됩니다. 모든 Task가 완료될 때까지 기다리려면 다음과 같이 awaitTermination()을 사용해야 합니다.
 * 
 * awaitTermination(): 설정한 시간동안 Task가 완료되기를 기다립니다
 * shutdownNow() : 예약된 Task를 취소하고, 실행 중인 모든 Task를 강제로 종료시킵니다.
 * @author JH1025
 *
 */
public class FixedSizeThreadPoolExecutorTest1 {

	private static int THREAD_SIZE = 4;
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(THREAD_SIZE);
		
		for(int i=0; i<10; i++) {
			
			final int j = i;
			System.out.println(LocalTime.now() + " Execute Task "+j);
			
			executor.execute(() -> {
				System.out.println(LocalTime.now() + " Execute Doing Job "+j);
				/**
				 * Something 
				 */
				sleepSec(3);
				System.out.println(LocalTime.now() + " Execute Done Jon "+j);
			});
		}
		
		executor.shutdown();
		
		if (executor.awaitTermination(5, TimeUnit.SECONDS)) {
            System.out.println(LocalTime.now() + " All jobs are terminated");
        } else {
            System.out.println(LocalTime.now() + " some jobs are not terminated");

            // 모든 Task를 강제 종료합니다.
            executor.shutdownNow();
        }
	}
	
	private static void sleepSec(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
