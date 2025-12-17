
package controller;

import dao.BookDAO;
import model.Book;
import java.util.List;

public class LibraryController {

    private BookDAO bookDAO = new BookDAO();

    public List<Book> getBooksByGenre(String genre) {
        return bookDAO.getBooksByGenre(genre);
    }
}
