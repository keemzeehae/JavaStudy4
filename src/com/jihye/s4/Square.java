package com.jihye.s4;

public class Square {
	//public static int y_size =1; 이라고 해도된다
	//public static int ySize =1; 이라고 해도된다
	//final 이 왔을 때 변수명 대문자로 씀 
	//class 앞에  public final class 이렇게 썼을 때는 Square 그대로 클래스의 문법을 따라간다 SQUARE(X)
	public static final int Y=1;
	final int X;
	
	public Square() {
		this.X=3;
	}
	
	public static void info () {
		
		System.out.println("Class Method");
		System.out.println(Square.Y);
//		this.info2();
		
	}
	public void info2 () {
		//this.x=6; //final을 붙이면 값을 변경할수 없는 상수가 됨
		
		System.out.println("Instance Method");
		System.out.println(this.X);
		System.out.println(Square.Y);
		
		Square.info();
	}

}
