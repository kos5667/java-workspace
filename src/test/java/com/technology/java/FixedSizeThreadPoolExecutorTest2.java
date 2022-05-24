package com.technology.java;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 사용가능한 코어 개수 만큼 쓰레드풀을 만드는 방법
 * 쓰레드풀 개수를 정할 때 최대한 기준이 애매할 수 있습니다. 
 * availableProcessors()는 Java가 실행 중인 JVM 환경에서 사용가능한 코어 개수를 리턴해줍니다.
 * @author JH1025
 *
 */
public class FixedSizeThreadPoolExecutorTest2 {
	
	public static void main(String[] args) {
		
		final int maxCore = Runtime.getRuntime().availableProcessors();
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(maxCore);
		
        System.out.println("Max thread pool size: " + executor.getMaximumPoolSize());

        for (int i = 0; i < 10; i++) {
            final int jobId = i;
            
            System.out.println("Execute task " + jobId);
            
            executor.execute(() -> {
                System.out.println("Doing a job " + jobId);
            });
        }
        executor.shutdown();
	}

}
