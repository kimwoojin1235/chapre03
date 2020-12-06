package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		//equals()의 재정의
		Point p=new Point(2,3);
		Point p01=new Point(2,3);
		Point p02=new Point(5,8);
		
		
		//전체 x값 y값 모두 같으면 같다라고 정의
		System.out.println(p.equals(p01)); 
		System.out.println(p.equals(p02));
	}

}
