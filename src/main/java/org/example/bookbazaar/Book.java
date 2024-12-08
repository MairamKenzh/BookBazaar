package org.example.bookbazaar;

public class Book {
    private int id;
    private String title;
    private String genre;
    private double price;
    private int stock;

    // Конструкторы
    public Book(int id, String title, String genre, double price, int stock) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.stock = stock;
    }

    // Геттеры и сеттеры
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}

