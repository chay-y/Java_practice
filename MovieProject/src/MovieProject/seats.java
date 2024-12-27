package MovieProject;

import java.util.ArrayList;

public class seats {

	//좌석배치도
	public static final int MAX_ROW = 5;
	public static final int MAX_COL = 9;
	private String[][] map = new String [MAX_ROW][MAX_COL];
	
	//생성자
	//빈 좌석은 'o'표시
	//이미 예매된 자리는 'x'표시
	public Seats(ArrayList<Reservation> reservations) throws Exception {
		for(int i=0; i<MAX_ROW; i++) {
			for(int j=0; j<MAX_COL; j++) {
				map[i][j]="o";
			}
		}
		for(int i=0; i<reservations.size(); i++) {
			Reservation r = resrvations.get(i);
			String seatName = r.g;
			mark(seatName);
		}
	}
	public  void show() throws Exception{
		System.out.println("=================================");
		System.out.println("========  S C R E E N  ==========");
		System.out.println("=================================");
		
		for(int i=0; i<MAX_ROW;i++) {
			for(int j=0; i<MAX_COL; j++) {
				System.out.printf(" %s", map[i][j]);
			}
		}
	}
	public void mar(String seatName) throws Exception{
		char[] temp = seatName.toCharArray();
		
		int row = temp[0] - 'A';

	}
}
