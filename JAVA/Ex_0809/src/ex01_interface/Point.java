package ex01_interface;

public class Point {
	
	//2차원 상의 한 점을 표현하는 Point 클래스
	//
	
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
