package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        final List<Book> books = new ArrayList<Book>();
        final Book pinkLife = new Book("la vie en rose",50,Categorie.ROMANTIC);
        books.add(pinkLife);
        final Book blackLife = new Book("la vie en noir",60,Categorie.ROMANTIC);
        books.add(blackLife);
        final Author Dickens = new Author("charles Dickens","Dickens",58,books);

        final List<Book> books1 = new ArrayList<Book>();
        final Book Cthulhu = new Book("legend of Cthulu", 100,Categorie.TECH);
        books1.add(Cthulhu);
        final Book extra = new Book("histoires extraordinaires",150,Categorie.TECH);
        books1.add(extra);
        final Author Poe = new Author("Edgar Poe", "Poe",74,books1);

        final List<Book> books2 = new ArrayList<Book>();
        final Book lol = new Book("lol",0,Categorie.POLICIER);
        books2.add(lol);
        final Author blague = new Author("grosse Blague","Blague",21,books2);

        List<Author> authors = new ArrayList<>();
        authors.add(Dickens);
        authors.add(Poe);
        authors.add(blague);

        System.out.println(authors.stream()
                .map(Author::getBooks)
                .flatMap(List::stream)
                .map(Book::getTitle)
                .collect(Collectors.toList()));
    }
}
