package com.javabycode.hibernate.model;

import java.util.Date;


public class Student {

	private int id;

	private String name;

	private Date enteringDate;

	private String nationality;
	
	private String code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void setEnteringDate(Date enteringDate) {
		this.enteringDate = enteringDate;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getCode() {
		return code;
	}
	
	public Date getEnteringDate() {
		return enteringDate;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", enteringDate="
				+ enteringDate + ", nationality=" + nationality + ", code=" + code + "]";
	}
	
	
	

}
