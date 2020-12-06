package com.javaex.ex02;

public class Point {
	private int x;
	private int y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void showinfo() {
		System.out.println("x:"+x+",  y:"+y);
	}
	//주소값 대용, 변경해서 사용 가능
	/*public int hashCode() {
		return 100;
	}*/
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
}
