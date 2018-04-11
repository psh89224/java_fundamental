package wearable;

public interface Color {
	public static final int RED = 1;	// public static final 생략가능
	int BLUE = 2;
	int WHITE = 3;
	int BLACK = 4;
	
	void changeColor(int color);
}