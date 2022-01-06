package com.jihye.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(4000);
		System.out.println(member.getAge());
		
		member.setCm(20000);
		System.out.println(member.getCm());
		
		member.setEmail("jihye@naver.com");
		System.out.println(member.getEmail());
		String email = member.getEmail();
		System.out.println(email);
		//용도에 따라서 두가지 방법 중 하나를 선택해서 쓰면 됨
		//첫번째는 바로 프린트 하는것 두번쨰는 변수에 담아서 쓸 수 있음
		
	}

}
