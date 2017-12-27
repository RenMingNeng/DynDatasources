package com.omar.entity;

import java.io.Serializable;

public class TestEntity implements Serializable{

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;

	/**
	 * 获取  id
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 获取  name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置 id
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 设置 name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
