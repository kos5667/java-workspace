package org.jhp.com.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jhp.com.util.CodeType;
import org.jhp.com.vo.ResponseModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ControllerExceptionAdvice
 */
@ControllerAdvice
public class ControllerExceptionAdvice {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    private String getLocationMessage(Exception e) {
		StackTraceElement[] stes = e.getStackTrace();
		if(stes==null||stes.length==0) {
			return e.getClass().getName();
		}
		StackTraceElement ste = stes[0];
		String fileName = ste.getFileName();
		String className = ste.getClassName();
		String methodName = ste.getMethodName();
		int lineNumber = ste.getLineNumber();
		String locationMessage = "Exception Occured at file "+fileName+" line "+lineNumber+" class "+className+"."+methodName+"()";
		return locationMessage;
	}

    public void console(Exception e) {
		logger.error(getLocationMessage(e)+"\nmessage : "+e.getMessage());
	}

    
    /**
	 * 에러 유형 - ApiException 
	 * 400 상태
	 * */
	@ExceptionHandler(ApiException.class)
	public Object handlerApiException(HttpServletRequest request, HttpServletResponse response, ApiException e) {
		ResponseModel<String> responseModel = new ResponseModel<>();
		CodeType codeType = e.getCodeType();
		console(e);
		if (codeType != null) {
			responseModel.setCode(codeType.getCode());
			responseModel.setMessage(codeType.getMessage());
			responseModel.setResult(e.getMessage());
		}else {
			responseModel.setCode(CodeType.ERROR.code);
			responseModel.setMessage(CodeType.ERROR.message);
			responseModel.setResult(e.getMessage());
		}
		return responseModel;
	}

}