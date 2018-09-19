package com.andy.dubbo.entity;

import java.io.Serializable;

public class Dept implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String street;
	private String telephone;
	
	
	
	public Dept() {
		super();
	}
	public Dept(Integer id, String name, String street, String telephone) {
		super();
		this.id = id;
		this.name = name;
		this.street = street;
		this.telephone = telephone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", street=" + street + ", telephone=" + telephone + "]";
	}
	
	
	
}
