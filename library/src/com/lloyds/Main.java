package com.lloyds;

import com.lloyds.library.Book;
import com.lloyds.library.Library;
import com.lloyds.library.Patron;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Hunger Games", "Suzanne Collins", "Young Adult", 43546755);
        Book book2 = new Book("Diary of a Wimpy Kid", "Jeff Kinney", "Young Adult", 76812098);
        Book book3 = new Book("How to Learn Rust", "Daniel Parry", "Non-Fiction", 34521876);
        Book book4 = new Book("1984", "George Orwell", "Dystopian", 90876543);
        Book book5 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Tragedy", 76320985);
        Book book6 = new Book("To Kill a Mockingbird", "Harper Lee", "Drama", 19412784);
        Book book7 = new Book("The Hunger Games: Catching Fire", "Suzanne Collins", "Young Adult", 98217653);

        Patron patron = new Patron("Keeley", "Gardner", "email@email.com");

        // add books to library
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);

        // borrow books
        patron.borrowBook(book1);
        patron.borrowBook(book5);
        System.out.println("Books borrowed: " + patron.getBooksBorrowed());

        // return book
        patron.returnBook(book1);
        System.out.println("Books borrowed: " + patron.getBooksBorrowed());
        System.out.println(" ");

        // search by ISBN and author
        System.out.println("Search result: " + library.searchByISBN(76812098));
        System.out.println("Search result: " + library.searchByAuthor("Suzanne collins"));
    }




}