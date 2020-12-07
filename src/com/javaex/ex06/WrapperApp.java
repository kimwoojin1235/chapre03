package com.javaex.ex06;

public class WrapperApp {

	public static void main(String[] args) {
		
		Integer n01=new Integer(23);
		Integer n02=new Integer(100);
		
		Integer sum=n01+n02;
		System.out.println(sum);
		
		Integer sum02=new Integer(50)+new Integer(51);
		System.out.println(sum02);
		
		int num=123;
		//int는 주소를가지지 못한다. 
		Integer i01=23;//i01에 23이라는 숫자가 박싱이된것
		//Integer는 주소를 가지고 있다.
		i01.parseInt("123");//박싱메소드가 포함...
		
		int no =n02;//int와Integer는 서로호환이 된다.
		//하지만Integer의 경우에는 알맹이인 100만 넣을수가 있다.
		//이건 언박싱 이라고 한다.
		
		//메소드 사용(Integer 예제)
		//문자열==>정수로 변경 숫자로 바뀔수 있을때만 해당
		int result= i01.parseInt("12345");//메모리에 관리되는 문자열을 정수형으로 바꾼다.
		System.out.println(result);
		
		//이상한점
		//"13579"==>13579 숫자로 변경
		Integer no03 =new Integer("131313");//쓸데없는 값을 넣어야 한다.
		int result01=no03.parseInt("13579");
		
		int result02=Integer.parseInt("13579");
		//parseInt은 스테틱영역에 올라가 있다 그러기에 쓸데없는 값을 넣지 않아도 된다.
		System.out.println(result02);
		
		//정수를 문자열로
		//12345==>"12345"
		String result03= String.valueOf(12345);
		System.out.println(result03);//문자열로 받음
		
		String result04 =""+12345;//형변환이 된다.위 방식을 바꾼것
	}

}
