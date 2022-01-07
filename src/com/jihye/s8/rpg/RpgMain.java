package com.jihye.s8.rpg;

public class RpgMain {

	public static void main(String[] args) {
		
		
		Knight k1 = new Knight();
		Magition m1 = new Magition ();
		Archer a1 = new Archer();
		//셋다 부모가 캐릭터 
		Character [] ch = new Character[3];
		ch[0] = k1;
		ch[1]= m1;
		ch[2]= a1;
		
		
//		Knight k1 = new Knight();
//		Magition m1 = new Magition();
//		
//		m1.name ="간달프";
//		m1.hp =100;
//		m1.mp =50;
//		Character c1 =m1;
//		System.out.println(c1.name);
//		System.out.println(c1.hp);
//	//	System.out.println(c1.mp);
//		
//		System.out.println(m1.mp);//this는 자식꺼 100.this.name 100.magition.name
//		System.out.println(m1.hp);
//		System.out.println(m1.name);
//		
//		
////		k1.attack();
////		k1.move();
////		m1.attack();

	}

}
