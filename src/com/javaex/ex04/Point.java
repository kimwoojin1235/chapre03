package com.javaex.ex04;

public class Point {
	private int x;
	private int y;

	public Point() {
	}

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
		System.out.println("x:" + x + ",  y:" + y);
	}
	

	/*
	// 주소값 대용, 변경해서 사용 가능
	public int hashCode() { 
	 	return x+y;
	}
	public boolean equals(Object obj) {
		if (this.hashCode()==((Point)obj).hashCode()) {
			if (this.x ==((Point)obj).x && this.y == ((Point)obj).y) {
				return true;
			}else {
				return false;
			}	
		}else {
			return false;
		}
	}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)//같은인스턴스인가
			return true;
		if (obj == null)//값이 없을때
			return false;
		if (getClass() != obj.getClass())//point circle비교할때
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
}
