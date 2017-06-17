package com.electro.mbile.util.objconvert;

import net.sf.json.JSONObject;

/**
 * 封装了jsonStr转换成object，object转换成jsonStr的代码
 *
 * @author admin
 *
 */
public class JSONUtil {
	
	/**
	 * 对象转换成JSON字符串
	 * **/
	public static String convertObjectToJson(Object object){
		JSONObject json = JSONObject.fromObject(object);
		return json.toString();
	}
	
	/**
	 * 字符串转换成对象
	 * **/
	public static Object converJsonToObject(String str,Class<?> obj){
		JSONObject jsStr = JSONObject.fromObject(str);
		Object object = JSONObject.toBean(jsStr,obj);
		return object;
	}
	
}
