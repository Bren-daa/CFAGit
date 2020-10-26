package com.company;

public class Book{
    private final String title;
    private final int pageNumber;
    private final Categorie categorie;

    public Book(String title, int pageNumber, Categorie categorie) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.categorie = categorie;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public String getTitle() {
        return title;
    }
}