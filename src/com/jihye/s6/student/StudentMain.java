package com.jihye.s6.student;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentDTOSecond ss = new StudentDTOSecond();
		StudentDTOThird st = new StudentDTOThird();
		
		ss.kor=10;
		ss.eng=20;
		ss.math=30;
		ss.history=50;
		ss.setTotal();
		
		st.kor=20;
		st.eng=20;
		st.math=30;
		st.physics=50;
		st.setTotal();
	}

}
