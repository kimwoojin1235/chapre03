package com.javaex.ex05;

public class StringApp02 {

	public static void main(String[] args) {
		String a =new String(" abc");
		String b =new String(",efg ");
		//concat()은 두 문자열을 붇인다.
		System.out.println(a.concat(b));
		System.out.println(a);//실제값은 변하지 않음
		a=a.concat(b);
		System.out.println(a);
		//trim()//공백을 없엔다.
		a=a.trim();
		System.out.println(a);
		System.out.println("--"+a+"--");//공백 확인용
		
		a=a.replace("c", "123");//앞에 입력한 문자를 뒤에 입력한 문자로 바꿔라
		System.out.println(a);
		System.out.println("=========================");
		//입력값을 기준으로 압뒤를 배열로 묶어서 출력해라
		String[] sArr=a.split(",");
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		String str="hello java";
		String result01= str.substring(3);
		//파라미터 에 들어간 숫자방부터 끝까지 출력
		System.out.println(result01);
		System.out.println(str);
		
		String result02 =str.substring(3,7);//3번방부터7번방 전까지 
		System.out.println(result02);
		
		char c=str.charAt(1);
		System.out.println(c);
		String c2= str.substring(3,5);
		System.out.println(c2);
	}

}
