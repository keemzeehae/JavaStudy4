package com.jihye.s6.student;

public class StudentDTOThird extends StudentDTO {
	
	
	int physics;
//	public StudentDTOThird() {
//		//super() 가 기본적으로 생략되어 있다
//		//그래서 처음에 this(); 쓰면 에러가 뜸
//	}

	@Override
	public int setTotal() {
		
			this.total = this.kor + this.eng + this.math + this.physics;
			System.out.println(this.total);
		
	
		return this.total;
	}
	
	
}
