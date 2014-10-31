package com.somnus.core.exception;

/**
 * DAO异常信息类
 * 
 * @author jzhang
 * 
 */
public class SystemException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7040031847309534682L;

	/**
	 * 构造方法
	 * 
	 * @param msg
	 *            异常信息
	 */
	public SystemException(String msg)
	{

		super(msg);

	}

}
