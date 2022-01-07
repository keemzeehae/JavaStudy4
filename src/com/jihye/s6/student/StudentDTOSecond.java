package com.jihye.s6.student;

public class StudentDTOSecond extends StudentDTO {
	
	public StudentDTOSecond() {
		
		//super()->부모의 생성자를 자동으로 호출하기 때문에 StudentDTO(){}부모생성자를 만들어놔야지 에러가 없어짐
	}
	
	int history;
	public int setTotal () {
		//오버라이딩
		this.total = this.kor+this.eng+this.math+this.history;
		System.out.println(this.total);
		return this.total;
		
	}
	

}
