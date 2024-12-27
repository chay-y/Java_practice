package day0821;

public class Box {
	int width;
	int height;
	int length;
	int volume;
	
	Box(int width, int height, int length) {
		this.width = width;
		this.height = height;
		this.length = length;
		this.volume = width*height*length;
	}
	
	public int getVolume() {
		this.volume = width*height*length;
		return volume;
	}
}
