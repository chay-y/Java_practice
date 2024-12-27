package MovieProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {
	
	private long id;
	private String title;
	private String genre;
	private static final File file = new File("movies.txt");
	
	public Movie(long id, String title,String genre) {
		this.id=id;
		this.title=title;
		this.genre=genre;
	}
	
	public Movie(String title, String genre) {
		//Instant.now() : 현재 시간의 객체를UTC기준의 ISO포맷으로 출력
		//getEpochSecond() : 초단위의 타임스태프 값을 long타입으로 얻어옴
		this.id=Instant.now().getEpochSecond();
		this.title=title;
		this.genre=genre;
	}
	
	public void save()throws IOException{
		FileWriter fw = new FileWriter(file);
		fw.write(this.toFileString());
	}
	
	public static ArrayList<Movie> findAll() throws IOException{
		java.util.ArrayList<Movie> movies = new ArrayList <Movie>();
		
		//스트림의 입출력 성능을 향상시키기 위해
		//버퍼를 이용하도록 하는 보조스트림
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		
		while((line = br.readLine())!=null) {
			//쉼표를 기준으로 문자열을 나누어 배열에 저장
			String[]temp =line.split(",");
			Movie m = new Movie(Long.parseLong(temp[0]),temp[1],temp[2]);
			movies.add(m);
		}
		
		//스트림 닫기
		br.close();
		//영화 객체가 담겨있는 Arraylist 반환
		return movies;
		
	}
	
	public static void delete(String movieIdStr) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String text = null;
		String line=null;
		//파일을 행 단위로 읽어옴
		while((line = br.readLine())!=null) {
			//쉼표를 기준으로 문자열을 나눔
			String[]temp = line.split(",");
			//삭제하려는 id값과 일치하는 자료를 찾으면
			if(movieIdStr.equals(temp[0])) {
				//다음 반복으로 넘어감(복사x)
				continue;
			}
			//읽은 문자열을 누적하여 저장
			text += line +"\n";
		}
		//파일 읽기 흐름을 해제
		br.close();
		//파일 작성을 위해 객체를 생성(덮어쓰기)
		FileWriter fw = new FileWriter(file);
		fw.write(text);
		fw.flush();
		fw.close();
	}
	
	public String toFileString() {
		return String.format("%d,%s,%s", id, title, genre);
	}
	
	public String toString() {
		return String.format("[%d] : %s(%s)",id,title,genre);
	}
}
