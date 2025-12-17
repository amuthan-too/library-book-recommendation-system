CREATE DATABASE IF NOT EXISTS library;
USE library;

CREATE TABLE IF NOT EXISTS books (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    genre VARCHAR(50)
);

INSERT INTO books (title, author, genre) VALUES
('Harry Potter', 'J.K. Rowling', 'Fantasy'),
('The Hobbit', 'J.R.R. Tolkien', 'Fantasy'),
('One Piece', 'Eiichiro Oda', 'Fantasy'),
('Naruto', 'Masashi Kishimoto', 'Fantasy'),
('Clean Code', 'Robert C. Martin', 'Programming'),
('Effective Java', 'Joshua Bloch', 'Programming'),
('Bro Code', 'Chris', 'Programming'),
('Python', 'Guido van Rossum', 'Programming'),
('Enlightenment', 'Buddha', 'Self Help'),
('Cant Hurt Me', 'David Goggins', 'Self Help'),
('Atomic Habits', 'James Clear', 'Self Help');
