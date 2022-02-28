package org.jhp.com.util;

public enum CodeType {
    
    SUCCESS						(100, "요청 성공"),
	FAIL						(0,   "요청 실패"),
	ERROR 						(-1,  "오류 발생"),
	ERROR_BAD_PARAM             (92,  "잘못된 파라미터 요청"),
	ERROR_NOT_INSERT			(93,  "등록된 값 없음"),
	ERROR_NOT_UPDATE			(94,  "수정된 값 없음"),
	ERROR_NOT_DELETE			(95,  "삭제된 값 없음"),
	ERROR_ALREADY_ADDED			(96,  "이미 추가된 레이어"),
	ERROR_RESULT_IS_NULL		(97,  "조회 결과 없음"),
	ERROR_EMPTY_PARAM			(98,  "필수 파라미터값 비어있는 오류"),
	ERROR_ETC					(99,  "기타 오류");
	
	public int code;
	public String message;
	
	CodeType(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}
