import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		Recommender rec = createShows();

		System.out.println("Do you want to watch a movie or a tv show?(movie/tv show)");
		String type = input.nextLine();
		System.out.println("What Genre do you want to watch?(crime/comedy)");
		String genre = input.nextLine();

		System.out.println("Here are your recommendations:");
		System.out.println(rec.getTopShows(type, genre));


	}

	public static Recommender createShows(){
		Recommender rec = new Recommender(10);
		rec.addShow("movie", "Sonic the Hedgehog", "comedy", 6.9f);
		rec.addShow("movie", "Inside Out 2", "comedy", 7.5f);
		rec.addShow("movie", "Carry-On", "crime", 6.5f);
		rec.addShow("movie", "Juror no.2", "crime", 7.0f);

		rec.addShow("tv show", "The Rookie", "crime", 8.0f);
		rec.addShow("tv show", "Blue Bloods", "crime", 7.7f);
		rec.addShow("tv show", "Spongebob Squarepants", "comedy", 8.2f);
		rec.addShow("tv show", "The Simpsons", "comedy", 8.7f);
		return rec;
	}
}