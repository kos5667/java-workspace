package org.jhp.com.vo;

public class ResponseModel<T> {
	
    // 결과 메시지
	private String message = "";
	
    // 결과 코드
	private int code = 0;
	
    // 결과
	private T result = null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
	
}