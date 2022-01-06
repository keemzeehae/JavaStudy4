package com.jihye.s3.member;

public class Member {

	private String name;
	private String email;
	private double kg;
	private double cm;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public double getCm() {
		return cm;
	}

	public void setCm(double cm) {
		this.cm = cm;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 입력하는 메서드, 가져가는 메서드
	// setter method ,getter method
	// 뭔가를 집어넣는 변수명은 set변수명
	// 뭔가를 가져가는 변수명은 get변수명

}
