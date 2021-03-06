package oop01.syntax;

public class Ractangle521 {
	public int width = 0;
	public int height = 0;
	public Point521 origin;
	
	//생성자 오버로딩
	public Ractangle521() {
		origin = new Point521(0,0);
	}
	public Ractangle521(Point521 p){
		origin = p;
	}
	public Ractangle521(int w, int h){
		origin = new Point521(0, 0);
		width = w;
		height = h;
	}
	public Ractangle521(Point521 p, int w, int h){
		origin = p;
		width = w;
		height = h;
	}
	/*
	 도형을 이동시키는 로직
	 * */
	public void move(int x, int y){
		origin.x = x;
		origin.y = y;
	}
	/*
	 면적 구하는 로직
	 * */
	public int getArea(){
		return width*height;
	}
}
