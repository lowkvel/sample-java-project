package com.example.demo.util;

import java.io.Serializable;

/**
 * @author wdk
 * @version 1.0
 */
public class HttpResult implements Serializable{

	private int code = 200;

	private String msg;
	private Object data;

	/**
	 *  异常结果
	 * @return 异常结果
	 */
	public static HttpResult error() {
		return error(201, "未知异常，请联系管理员");
	}

	/**
	 * 异常结果
	 * @param msg 说明
	 * @return 结果
	 */
	public static HttpResult error(String msg) {
		return error(500, msg);
	}

	/**
	 *  异常结果
	 * @param code 状态码
	 * @param msg 说明
	 * @return 结果
	 */
	public static HttpResult error(int code, String msg) {
		HttpResult r = new HttpResult();
		r.setCode(code);
		r.setMsg(msg);
		return r;
	}

	/**
	 * 正常结果
	 * @param msg 说明
	 * @return 结果
	 */
	public static HttpResult ok(String msg) {
		HttpResult r = new HttpResult();
		r.setMsg(msg);
		return r;
	}

	/**
	 * 正常结果
	 * @param data 数据
	 * @return 结果
	 */
	public static HttpResult ok(Object data) {
		HttpResult r = new HttpResult();
		r.setData(data);
		return r;
	}

	/**
	 * 正常结果
	 * @return 结果
	 */
	public static HttpResult ok() {
		return new HttpResult();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * 清酒成功
	 * @param data 数据
	 * @param msg 消息
	 */
	public void setOk(Object data,String msg) {
		this.msg = msg;
		this.data = data;

	}

	/**
	 * 设置失败
	 */
	public  void setUnknownErr() {
		this.msg = "未知错误";
		this.code = 4000;

	}
}
