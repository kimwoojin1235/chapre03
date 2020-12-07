package com.javaex.ex05;

public class StringApp {

	public static void main(String[] args) {
		//표현식1
		String str=new String("안녕하세요");
		System.out.println(str);//주소를 주었다
		//println은 주소값을 피라미터로 사용을 하면 toString()을 실행한다.
		//System.out.println(str.toString());
		
		String str01="안녕!!";//표현식2
		System.out.println(str01);
		String s01 = new String("hi");
		String s02 = new String("hi");
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s01==s02);
		System.out.println(s01.hashCode()==s02.hashCode());//hashCode()값이 같다.
		
		if(s01==s02) {
			//주소값이 같은경우
		}
		if(s01.equals("hi")) {//nullpoint가 되는 경우가 있음
			//문자열이 같은 경우
		}
		//
		if("hi".equals(s01)) {//널포인트 발생 안함
			//문자열이 같은 경우
		}
		System.out.println("=특이케이스==========================");
		
		String s03="hello";
		String s04="hello";//같은 내용을 찾아서 기존것 사용
		//같은 string을 사용을 한다.
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s03==s04);//같은 주소 값을같는다
		System.out.println(s03.hashCode());//hashCode()값이 같다.
		System.out.println(s04.hashCode());//hashCode()값이 같다.
		s03="hello!!!!!!";//약식으로 섰을때 글자를 변경하면 새로 메모리에 올림
		System.out.println(s03);
		System.out.println(s04);//값이 바뀌지 않아 이상해
		System.out.println(s03==s04);//주소값이 다름
		
	}
}
