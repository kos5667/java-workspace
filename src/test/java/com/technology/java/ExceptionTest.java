package com.technology.java;

import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ExceptionTest {

    @ExceptionHandler(NullPointerException.class)
    public Object exceptionHandler(Exception e) {
        System.out.println("in");
        System.out.println(e);
        return e;
    }

    @Test
    public void TEST1() throws NullPointerException {
        // throw new ApiException(CodeType.ERROR,"Exception Test");
        try {
            System.out.println("start");
            throw new NullPointerException();
        } catch (Exception e) {
            // exceptionHandler(e);
        }
    }
}
