package com.codeLife.init.common.exception;

import com.codeLife.init.common.param.CodeMsg;
import lombok.Data;

@Data
public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String code;
	
	private String msg;

	public CustomException(CodeMsg codeMsg) {
		this.code = codeMsg.getCode();
		this.msg = codeMsg.getMsg();
	}

}