package org.jhp.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.jhp.com.exception.ApiException;
import org.jhp.com.util.CodeType;
import org.jhp.com.vo.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/rest")
public class MvcRestController {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Handling Exception Test
     * @throws Exception
     */
    @RequestMapping(value="/callMethod1", method={RequestMethod.GET})
    public void method1() throws Exception {
        System.out.println("in");
        throw new ApiException();
    }

    /**
     * Create return object(ResponseModel<Object>)
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/callMethod2", method={RequestMethod.GET})
    public Object method2() throws Exception {
        Map<String, Object> result = new HashMap<String,Object>();
        result.put("name", "jh");
        result.put("age", 19);

        ResponseModel<Map<String, Object>> responseModel = new ResponseModel<>();
        responseModel.setResult(result);
        responseModel.setCode(CodeType.SUCCESS.getCode());
        responseModel.setMessage("return 객체");
        return responseModel;
    }

}
