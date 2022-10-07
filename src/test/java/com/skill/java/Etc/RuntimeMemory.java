package com.skill.java.Etc;

public class RuntimeMemory {
    
    public static void main(String[] args) {
        
		// Garbage Collection으로 메모리 초기화
		System.gc(); 
		
		// 실행전 메모리 사용량 조회
		long before = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		// 측정하고싶은 코드
		int j = 0;
		for(int i=0; i<100000000; i++) {
			j = j+i;
		}
		
		// Garbage Collection으로 메모리 정리
		System.gc();
		
		// 실행 후 메모리 사용량 조회
		long after  = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		// 메모리 사용량 측정
		long usedMemory = (before - after)/1024/1024;

        System.out.println("Before : "+before+",After : "+after);
		System.out.println("Used Memory : " + usedMemory);
        
        // 애플리케이션에 할당돈 힙메모리 사이즈. 이 사이즈를 넘어서면 OOM발생
		long heapSize = Runtime.getRuntime().maxMemory();
		System.out.println(heapSize/1024/1024);
    }
}
