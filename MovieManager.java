package ArrayListObjectBased;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MovieManager {
	
	ArrayList<Movie> movies;
	Scanner scanner;
    
	 public MovieManager() {
		 this.movies = new ArrayList<>();
		 this.scanner = new Scanner(System.in);
	 }
     // Adding Movie
	 public void addMovies() {
		 movies.add(new Movie("Movie1", "Director1", 7.5, 200));
		 movies.add(new Movie("Movie2", "Director2", 5.5, 120));
		 movies.add(new Movie("Movie3", "Director3", 8,   160));
		 movies.add(new Movie("Movie4", "Director4", 2.3, 190));
		 movies.add(new Movie("Movie5", "Director5", 6.6, 175));
		 System.out.println("Movie List added");
	 }
	 //Display Movie
	 public void displayMovie() {
		 for(Movie obj: movies) {
			 System.out.println(obj);
		 }
	 }
	 // Sort movie on basis of rating
	 public void sortMovie() {
		 Collections.sort(movies, new Comparator<Movie>(){
		 
			 public int compare(Movie m1, Movie m2) {
				 return Double.compare(m2.getRating(), m1.getRating());
			 }
	 });
}
	 public void removeMovie() {
		 for(int i=0; i < movies.size(); i++) {
			 if(movies.get(i).getRating()<5.0) {
				 movies.remove(i);
				 i--;
			 }
		 }
	 }
	 public void categoryUpdate() {
		 for(Movie obj: movies) {
			 if(obj.getDuration()  > 180) {
				 obj.setCategory("Blockbuster");
			 }else {
				 obj.setCategory("Regular");
			 }
		 }
	 }
}
