package com;

import org.junit.jupiter.api.Test;

public class TEST {
    
    @Test
    public void TEST1() throws Exception {
        System.out.println("TEST 1");
    }

    @Test
    public void TEST2() throws Exception {
        System.out.println("TEST 2");
    }

    @Test
    public void TEST3() throws Exception {
        throw new Exception("TEST3");
    }

}
