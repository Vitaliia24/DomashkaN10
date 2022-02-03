package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author rowling = new Author("Joanne", "Rowling");

        Book annaKarenina = new Book("Anna Karenina", "1873", tolstoy);
        Book garryPotter = new Book("Garry Potter", "2000", rowling);

        garryPotter.setPublishingYear(1998);
    }
}
