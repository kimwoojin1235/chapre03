package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		Point p=new Point(2,3);
		Point p01=new Point(2,3);
		Point p02=new Point(100,100);
		Point p05=p;
		//System.out.println(p.toString());
		//object 클래스가 부모이다.
		//object 클래스의 메소드 +point 클래스의 메소드를 사용하수 있다
		//겹치는 메소드 주의
		
		//toString()
		System.out.println("toString===================");
		//테스트 point클래스의 tostring() 지운다.
		System.out.println(p.toString());
		
		//메소드 오버라이딩
		Object op=new Point();
		System.out.println(op.toString());
		
		//.println은 toString()을 찾아 출력
		System.out.println(p);//주소값의toString()을 찾아 찍는다.
		
		//getCless()
		System.out.println("getCless=================");
		System.out.println(p.getClass());
		
		//hashCode()주소대용으로 사용할수 있다.
		System.out.println("hashCode=================");
		System.out.println(p.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		//equals() 같은지 비교 다시 정의해서 사용을 해라
		System.out.println("equals()=================");
		System.out.println(p.equals(p01));
		//주소값이 다르면 false로 처리
		
		//주소값을 직접 비교할때 사용
		System.out.println(p==p01);
		System.out.println(p==p05);
		
		
	}

}
