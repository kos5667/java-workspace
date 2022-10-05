package com.skill.java.Recursion;

public class TailCallRecursion {

    
    public static void main(String[] args) {

        // Runtime.getRuntime().gc();
        System.gc();
        
        long before = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        
        // 반복문
        int c = iteration(5);
        System.out.println(c);

        // 재귀 함수
        int a = recursive(5);
        System.out.println(a);
        
        // 꼬리 재귀 함수
        int b = tailRecursive(5,1);
        System.out.println(b);

        System.gc();
        long after = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long usedMemory = (before - after)/1024/1024;

        System.out.println("Before : "+before+",After : "+after);
        System.out.println("Used Memory : " + usedMemory);
    }

    /**
     * 재귀 함수는 기본적으로 스택 메모리를 사용하는데 재귀의 깊이가 깊어졌을 때, stack overflow가 발생하면서 프로그램이 비정상적으로 종료 될 수 있다. 
     * 언제나 안전한 프로그램을 개발해야 하는 입장에서, 충분히 에러가 발생할 수 있는 여지를 남겨놓는 것은 바람직하지 않다.
     * 
     * 또한 함수가 호출되고 종료될 때 스택 프레임을 구성하고 해제하는 과정에서 반복문보다 오버헤드가 들기 때문에 속도도 훨씬 느려지게 된다
     * 
     * stack overflow란? 
     * 함수를 호출하면 함수의 매개변수, 지역변수, 리턴 값, 그리고 함수 종료 후 돌아가는 위치가 스택 메모리에 함께 저장된다.
     * 재귀함수를 쓰게되면, 함수를 반복적으로 호출하므로, 스택 메모리에 콜 스택이 쌓이게 된다. 
     * 함수를 호출하는 횟수가 많아진다면 스택 메모리를 초과하여 stack overflow가 발생할 수 있다.
     * 그러나 일반적인 반복문을 사용하면 지역 변수들이 호출될 때 한번만 할당되기 때문에 그러한 비효율이 발생하지 않는다.
     * 
     * Overhead란?
     * 오버헤드(Overhead)란 어떤 처리를 하기 위해 들어가는 간접적인 처리 시간 · 메모리 등을 말한다.
     */
    public static int recursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursive(n - 1);
    }

    /**
     * 꼬리 재귀 (tail call recursion)
     * 재귀함수의 이러한 단점을 보완하고자 꼬리 재귀라는 기법을 사용할 수 있다.
     * 
     * 단, 컴파일러가 꼬리 재귀 최적화를 지원해야만 실질적으로 단점을 보완할 수 있다.
     * 코드를 통해 살펴보면 일반 재귀 함수와 꼬리재귀 함수는 각각 다음과 같은 형태를 가진다.
     * 
     * 두 함수의 큰 차이는 다음 호출을 위한 파라미터의 연산이 어디서 일어나는가 이다. 
     * 즉, 다시말해 return 문에 연산이 있느냐 없느냐 차이라고 볼 수 있다.
     * 
     * 함수가 리턴된 후에 아무 작업도 하지 않도록 하는 것을 꼬리 호출(tail call)이라 하고, 
     * 이런 구조를 꼬리 재귀(tail recursion)라고 하며, 이런 함수를 꼬리재귀함수(tail recursion function)라고 한다.
     * 
     * 꼬리 재귀는 연산이 return 문 이전에 이루어지고 다음 함수 호출 시 파라미터를 통해 필요한 연산의 결과를 전달한다. 
     * 함수가 호출되는 시점에 컴파일러는 꼬리재귀를 최적화하게 되는데, 이 과정에서 꼬리 재귀는 반복문으로 변경된다. 
     * 기존의 재귀 형태를 최적화 가능한 형태로 변경하면서 컴파일시 반복문으로 해석될 수 있도록 만들면 기존에 문제였던 메모리와 성능에 대한 문제를 해결할 수 있다.
     */
    public static int tailRecursive(int n, int acc) {
        if (n == 1) {
            return acc;
        }
        return tailRecursive(n - 1, n + acc);
    }

    /**
     * 반복문
     */
    public static int iteration(int n) {
        int value = 0;

        for(int i=1;i<=n; i++) {
            value += i;
        }
        return value;
    }
}
