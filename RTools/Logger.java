package com.meishe.aidemo.utils;

import android.util.Log;

/**
 * @author LiFei
 * @version 1.0
 * @title
 * @description 该类主要功能描述
 * @company 
 * @created 2019/9/17 17:36
 * @changeRecord [修改记录] <br/>
 */
public class Logger {

	private static final String APP_NAME = "MSAI";
	private static boolean DEBUG = true;

	public static void init(Boolean enableLog){
		DEBUG = enableLog;
	}


	public static void setDebugEnable(boolean enable) {
		Logger.DEBUG = enable;
	}

	public static final void v(String message) {
		if (DEBUG) {
			Log.v(APP_NAME, getFileName() + " - " + message);
		}
	}

	/**
	 * 
	 * @param message
	 */
	public static final void d(String message) {
		if (DEBUG) {
			Log.d(APP_NAME, getFileName() + " - " + message);
		}
	}

	public static final void d(String message, Throwable e) {
		if (DEBUG) {

			Log.d(APP_NAME, getFileName() + " - " + message);
			if (e == null) {
				return;
			}
			printThrowable(e);
			if (e.getCause() != null) {
				printDebugThrowable(e.getCause());
			}
		}
	}

	/**
	 * 
	 * @param message
	 */
	public static final void i(String message) {
		if(DEBUG)
		Log.i(APP_NAME, getFileName() + " - " + message);
	}

	/**
	 * 
	 * @param message
	 */
	public static final void e(String message) {
		if(DEBUG)
		Log.e(APP_NAME, getFileName() + " - " + message);
	}

	/**
	 * 
	 * @param message
	 */
	public static final void w(String message) {
		if(DEBUG)
		Log.w(APP_NAME, getFileName() + " - " + message);
	}

	/**
	 * 
	 * 
	 * @return
	 */
	private static String getFileName() {
		Exception e = new Exception();
		StackTraceElement[] elements = e.getStackTrace();
		String ret = "";
		if (elements.length > 2) {
			ret = "(" + elements[2].getFileName();
			ret += ":";
			ret += elements[2].getLineNumber() + ")";
		}
		return ret;
	}

	/**
	 * 
	 * @param message
	 * @param e
	 */
	public static final void e(String message, Throwable e) {
		if(!DEBUG)return;
		Log.e(APP_NAME, getFileName() + " - " + message);
		if (e == null) {
			return;
		}
		printThrowable(e);
		if (e.getCause() != null) {
			printThrowable(e.getCause());
		}
	}

	/**
	 * 
	 * @param e
	 */
	private static final void printDebugThrowable(Throwable e) {
		if (e == null||!DEBUG) {
			return;
		}
		Log.d(APP_NAME, e.getClass().getName() + ": " + e.getMessage());
		for (StackTraceElement element : e.getStackTrace()) {
			Log.d(APP_NAME,
					"  at " + element.getClassName() + "."
							+ element.getMethodName() + "("
							+ element.getFileName() + ":"
							+ element.getLineNumber() + ")");
		}
	}

	/**
	 * 
	 * @param e
	 */
	private static final void printThrowable(Throwable e) {
		if (e == null||!DEBUG) {
			return;
		}

		Log.e(APP_NAME, e.getClass().getName() + ": " + e.getMessage());
		for (StackTraceElement element : e.getStackTrace()) {
			Log.e(APP_NAME,
					"  at " + element.getClassName() + "."
							+ element.getMethodName() + "("
							+ element.getFileName() + ":"
							+ element.getLineNumber() + ")");
		}
	}
}
