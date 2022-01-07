package com.jihye.s5;

public class MyGod {
	
	private static  MyGod myGod;	
	public static MyGod makeGod() {
		if(MyGod.myGod == null) {
			MyGod.myGod = new MyGod();
			
		}
		
		return MyGod.myGod;
		
	}
}
