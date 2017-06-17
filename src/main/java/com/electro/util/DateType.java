package com.electro.util;

public enum DateType{
	YEAR(1,"year"),
	MONTH(2,"month"),
	DATE(3,"date"),
	HOUR(4,"hour"),
	MINUTE(5,"minute"),
	SECOND(6,"second");
	// 成员变量
    private int key;
    private String value;
    
    private DateType(int key, String value) {
		this.key = key;
		this.value = value;
	}
    // 普通方法
    public static String getName(int key) {
        for (DateType c : DateType.values()) {
            if (c.getKey() == key) {
                return c.value;
            }
        }
        return null;
    }
	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
 
}
