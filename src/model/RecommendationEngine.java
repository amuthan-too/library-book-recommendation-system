package model;

import java.util.ArrayList;
import java.util.List;

public class RecommendationEngine {

    public List<Book> recommendByGenre(List<Book> books, String genre) {

        List<Book> recommendedBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                recommendedBooks.add(book);
            }
        }

        return recommendedBooks;
    }
}
