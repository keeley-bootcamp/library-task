package com.lloyds;

import com.lloyds.library.Book;
import com.lloyds.library.Patron;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Hunger Games", "Suzanne Collins", "Young Adult", 43546755);
        Book book2 = new Book("Diary of a Wimpy Kid", "Jeff Kinney", "Young Adult", 76812098);
        Book book3 = new Book("How to Learn Rust", "Daniel Parry", "Non-Fiction", 34521876);

        Patron patron = new Patron("Keeley", "Gardner", "email@email.com");
        patron.borrowBook(book1);

    }




}