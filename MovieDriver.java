import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String continueInput;

        do {
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
            keyboard.nextLine();
            movie.setSoldTickets(ticketsSold);

            // Print out the information.
            System.out.println(movie.toString());

            // Ask the user if they want to enter another movie.
            System.out.println("Do you want to enter another? (y or n)");
            continueInput = keyboard.nextLine();
        } while (continueInput.equalsIgnoreCase("y"));

        System.out.println("Goodbye");
    }
}
