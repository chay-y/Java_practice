package MovieProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Reservation {

	private long id;
	private long movieId;
	private String movieTitle;
	private String seatName;
	private static final File file = new File("reservations.txt");
	
	public Reservation(long id,long movieId, String movieTitle,String seatName) {
		this.id=id;
		this.movieId=movieId;
		this.movieTitle=movieTitle;
		this.seatName=seatName;
	}
	
	public static Reservation findById(String reservationId)throws IOException{
		Reservation r = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		
		while((line=br.readLine())!=null) {
			String[] temp = line.split(",");
			
			if(reservationId.equals((temp[0])){
				r=new Reservation(
						Long.parseLong(temp[0]), Long.parseLong(temp[1]),temp[2],temp[3]);
				break;
						
			}
		}
		br.close();
	}
	
	public static ArrayList<Reservation> findByMovieId(String movieId){
		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		
		
		while((line=br.readLine())!=null) {
			String[] temp = line.split(",");
			
			if(movieIdStr.equals((temp[1])){
				long id = Long.parseLong(temp[0]);
				long movieId = Long.parseLong(temp[1]);
				String movieTitle = temp[2];
				String seatName = temp[3];
				
				Reservation r =new Reservation(id,movieId,movieTitle,seatName);
				reservations.add(r);
				
				continue;
			}
		}
		br.close();
		
		return reservations;
	}
	
	public void save() throws IOException{
		
		//이어쓰기 모드 설정
		FileWriter fw = new FileWriter(file, true);
		fw.write(this.toFileString()+"\n");
		fw.flush();
		fw.close();
	}
	
	@Override
	public String toString() {
		return String.format("영화 : %s, 좌석 : %s", movieTitle, seatName);
	}
	
	public String toFileString() {
		return String.format("%d,%d,%s,%s", id, movieId, movieTitle, seatName);
	}
}
