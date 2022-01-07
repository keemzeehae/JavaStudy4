package com.jihye.s5;

public class MyGodMain {

	public static void main(String[] args) {
		MyGod myGod=MyGod.makeGod();
		System.out.println(myGod);
//		MyGod m1 = new MyGod();
		MyGod m2 = new MyGod();
		System.out.println(m2);
		System.out.println(MyGod.makeGod());
		//SingleTon  전체프로그램에서 이 클래스의 개체를 
		//클래스 메서드 -> 힌트 
		//클래스메서드는 객체를 만들지 않고 사용 가능

	}

}
