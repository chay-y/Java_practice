package day0820;

public class PointArrMain {

	public static void main(String[] args) {
		
		Point[] Arr = new Point[5];
		
		for(int i=0; i<Arr.length; i++) {
			Arr[i] = new Point();
			Arr[i].x = i+1;
			Arr[i].y = i*2;
			System.out.printf("Arr[%d].x=%d\n",i,Arr[i].x);
			System.out.printf("Arr[%d].y=%d\n",i,Arr[i].y);
		}
	}
}
