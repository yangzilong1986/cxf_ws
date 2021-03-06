package com.ritchey.chapel.domain;

public interface Reflect {
	public Object get(String fieldName);
	public void set(String fieldName, Object value);
	public String simpleName();
	public void copy(Object reflect);
}
