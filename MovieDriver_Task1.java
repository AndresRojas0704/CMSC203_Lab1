import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Movie movie = new Movie();

        // Prompt the user to enter the movie title.
        System.out.println("Enter the title of a movie:");
        String title = keyboard.nextLine();
        movie.setTitle(title);

        // Prompt the user to enter the movie's rating
        System.out.println("Enter the rating of the movie:");
        String rating = keyboard.nextLine();
        movie.setRating(rating);

        // Prompt the user to enter the number of tickets sold.
        System.out.println("Enter the number of tickets sold for this movie:");
        int ticketsSold = keyboard.nextInt();
        movie.setSoldTickets(ticketsSold);

        // Print out the information using the movie's toString method
        System.out.println(movie.toString());
        System.out.println("Goodbye");
        }
}
