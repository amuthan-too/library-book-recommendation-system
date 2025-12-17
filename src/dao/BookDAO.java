package dao;

import model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooksByGenre(String genre) {

        List<Book> books = new ArrayList<>();

        String query = "SELECT * FROM books WHERE genre = ?";

        try {
            Connection con = DBConnection.getConnection();

            if (con == null) {
                System.out.println("Connection is NULL");
                return books;
            }

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, genre);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Book book = new Book(
                        rs.getInt("book_id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("genre")
                );
                books.add(book);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return books;
    }

}   // ✅ THIS BRACE WAS MISSING

