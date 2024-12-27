package MovieProject;

import java.io.IOException;
import java.util.ArrayList;

public class MainMenu extends AbstractMenu{

	private static final MainMenu instance = new MainMenu(null);
	
	private static final String MAIN_MENU_TEXT = "1 : 영화 예매하기 \n" +
			"2 : 예매 확인하기 \n" +
			"3 : 예매 취소하기 \n" +
			"4 : 관리자 메뉴로 이동 \n" +
			"q : 종료 \n\n" +
			"메뉴를 선택하세요 > ";
	private MainMenu(Menu prevMenu) {
		super(MAIN_MENU_TEXT,prevMenu);
	}
	
	public static MainMenu getInstance() {
		return instance;
	}
	
	
	public Menu next() {
		switch(scan.nextLine()) {
		
		case "2" :
			checkReservation();
			return this;
		
		case "4" :
			if(!checkAdminPasword()) {
				System.out.println("> 비밀번호가 틀렸습니다");
				return this;
			}
			AdminMenu adminMenu = AdminMenu.getInstance();
			adminMenu.setPrevMenu(this);
			return adminMenu;
			
		case "q" :
			return prevMenu;
		default : 
			return this;
		}
	}
	
	private void reserve() {
		ArrayList<Movie>movies=Movie.findAll();
		
		for(int i=0; i<movies.size(); i++) {
			System.out.printf("%s\n",movies.get(i).toString());
		}
		System.out.println("예매할 영화를 선택하세요 >> ");
		String movieIdStr = scan.nextLine();
		
		try {
			Movie m =Movie.findById(movieIdStr);
			
			ArrayList <Reservation>reservations=Reservation.findByMovieId(movieIdStr);
			
			seats seats = new Seats(reservations);
			seats.show();
			Reservation r = new Reservation(Long.parseLong(movieIdStr),m.getTitle(),seatName);
			r.save();
			
			System.out.println("예매가 완료되었습니다.");
			System.out.println("예매번호 : %d \n", r.getId());
		}catch(IOException e) {
			System.out.println("예매에 실패하셨습니다.");
			e.printStackTrace();
		}
	}
	private void checkReservation() {
		System.out.println("예매 번호를 입력하세요 : ");
		
		try {
			Reservation r = Reservation.findById(scan.nextLine());
			if (r != null) {
				System.out.printf(">> [예매확인] %s %n",r.toString());
			}else {
				System.out.println("예매 내역이 없습니다.");
			}
		}catch(IOException e) {
			System.out.println("예매 내역 확인 시 예외 발생.");
			e.printStackTrace();
		}
		
	}
	private void checkAdminPasword() {
		
	}
}
