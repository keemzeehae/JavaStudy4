package com.jihye.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Phone phone = new Phone();
		Tv tv = new Tv();
		
		computer.brand ="gram";
		computer.company = "LG";
		computer.cpu = "i5";
		computer.price =200;
		computer.point =100;
		
		phone.brand = "iphone12";
		phone.company ="Apple";
		phone.pixel = 200;
		phone.price =100;
		phone.point =50;
		
		tv.brand = "QLED";
		tv.company = "Samsung";
		tv.size = 150;
		tv.price =200;
		tv.point =200;
		
		Client iu = new Client();
		iu.money = 1000;
		iu.point =0;
		iu.buy(tv);
		iu.buy(phone);
		iu.buy(computer);
		
//		Product [] pd = new Product[3];
//		pd[0]=computer;
//		pd[1]=phone;
//		pd[2]=tv;
		
	}

}
