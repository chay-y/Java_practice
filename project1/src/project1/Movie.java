package project1;

public class Movie {
	private String title;
	private String director;
	private String ReleaseDate;
	
	public Movie(String title, String director, String ReleaseDate){
		this.title=title;
		this.director=director;
		this.ReleaseDate=ReleaseDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getReleaseDate() {
		return ReleaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		ReleaseDate = releaseDate;
	}
	
	
}
