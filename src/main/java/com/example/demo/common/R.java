package com.example.demo.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 返回数据
 * @author Loco.Li
 * @date: 2023/11/26 16:51
 **/
public class R extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public <T> T getData(String key, TypeReference<T> typeReference) {
		Object data = get(key);
		String s = JSON.toJSONString(data);
		T t = JSON.parseObject(s, typeReference);
		return t;
	}

	public <T> T getData(TypeReference<T> typeReference) {
		Object data = get("data");
		String s = JSON.toJSONString(data);
		T t = JSON.parseObject(s, typeReference);
		return t;
	}

	public R setData(Object data) {
		put("data", data);
		return this;
	}

	public R() {
		put("code", 0);
		put("msg", "success");
	}

	public static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}

	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}

	public static R ok(String code,String msg,Object data) {
		HashMap<String, Object> hashMap = new HashMap<>();
		hashMap.put("code",code);
		hashMap.put("msg",msg);
		hashMap.put("data",data);
		R r = new R();
		r.putAll(hashMap);
		return r;
	}

	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}

	public Integer getCode() {
		return (Integer) this.get("code");
	}

}
