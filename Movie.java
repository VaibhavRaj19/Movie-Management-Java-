package ArrayListObjectBased;

public class Movie 
{
	String moviename;
	String director;
	double rating;
	int duration;
	String category;
	public Movie(String moviename, String director, double rating, int duration) {
		this.moviename = moviename;
		this.director = director;
		this.rating = rating;
		this.duration = duration;
		this.category = null;
	}
	public String getMoviename() {
		return moviename;
	}
	public String getDirector() {
		return director;
	}
	public double getRating() {
		return rating;
	}
	public int getDuration() {
		return duration;
	}
	public String getCategory() {
		return category;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String toString() {
		return "Movie Name : "+ moviename +"| Director : " + director + "| Rating : "+ rating + 
				"| Duration : " + duration + "| Category : "+ category;
	}

}
