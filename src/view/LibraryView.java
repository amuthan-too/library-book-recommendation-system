package view;

import controller.LibraryController;
import model.Book;
import java.util.List;
import java.util.Scanner;

public class LibraryView {
	public void start() {

	    Scanner sc = new Scanner(System.in);
	    LibraryController controller = new LibraryController();

	    while (true) {

	        System.out.print("\nEnter book genre: ");
	        String genre = sc.nextLine().trim();

	        List<Book> books = controller.getBooksByGenre(genre);

	        System.out.println("\nRecommended Books:");

	        if (books == null || books.isEmpty()) {
	            System.out.println("No books found for this genre.");
	        } else {
	            for (Book b : books) {
	                System.out.println(b.getTitle() + " by " + b.getAuthor());
	            }
	        }

	        System.out.print("\nDo you want to search again? (yes/no): ");
	        String choice = sc.nextLine().trim();

	        if (choice.equalsIgnoreCase("no")) {
	            System.out.println("Thank you for using Library Recommendation System!");
	            break;
	        }
	    }
	}

}

    