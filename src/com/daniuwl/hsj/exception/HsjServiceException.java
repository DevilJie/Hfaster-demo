package com.daniuwl.hsj.exception;

import java.io.Serializable;

/**
 * 自定义 运行时异常
 * @ClassName HsjRuntimeException.java
 * @Description 
 * @author Caizongyou 
 * @date 2015年5月30日 下午9:17:18
 */
public class HsjServiceException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int errorCode;
	
	public HsjServiceException() {
		super();
	}

	public HsjServiceException(String msg) {
		super(msg);
	}

	public HsjServiceException(Throwable cause) {
		super(cause);
	}

	public HsjServiceException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public HsjServiceException(String msg, int errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}

	public HsjServiceException(Throwable cause, int errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}

	public HsjServiceException(String msg, Throwable cause, int errorCode) {
		super(msg, cause);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
