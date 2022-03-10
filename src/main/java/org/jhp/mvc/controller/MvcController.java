package org.jhp.mvc.controller;

import org.jhp.com.exception.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvcController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/callMethod1", method={RequestMethod.GET})
    public void method1() throws ApiException {
        System.out.println("in");
        logger.info("test");
        throw new ApiException();
    }
    
}
