package ArrayListObjectBased;

public class MovieManagement {
	
	public static void main(String[] args) {
		
		MovieManager mm = new MovieManager();
		
		mm.addMovies();
		mm.displayMovie();
	    
		System.out.println(">--------------->");
		System.out.println("After Sorting");
		mm.sortMovie();
		mm.displayMovie();
		
		System.out.println(">--------------->");
		System.out.println("After Remove Movie Having Rating Less Then 5");
		mm.removeMovie();
		mm.displayMovie();
		
		System.out.println(">--------------->");
		System.out.println("After Updating Category");
		mm.categoryUpdate();
		mm.displayMovie();
		
	}

}
