package com.env.miniprogram.dto;

import com.env.miniprogram.web.common.ResponseCode;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result<T> {

	private T data;// 成功时返回的数据

	private String error;// 错误信息
	private int code;

	public Result() {
	}


	// 成功时的构造器
	public Result(int code, T data) {
		this.code = code;
		this.data = data;
		this.error = "";
	}

	// 错误时的构造器
	public Result(int code, String error) {
		this.code = code;
		this.error = error;
		this.data = null;
	}

	public static <T> Result<T> makeSuccess(T data){
		return new Result<T> (ResponseCode.SUCCESS,data);
	}

	public static <T> Result<T> makeError(int code,String error){
		return new Result<T>(code,error);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "JsonResult [code=" + code + ", data=" + data + ", error=" + error + "]";
	}

}
