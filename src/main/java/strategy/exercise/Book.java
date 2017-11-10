package strategy.exercise;

/**
 * Created by sanguk on 10/11/2017.
 */
public class Book {
    private String title;
    private int publishYear;
    private int price;

    Book(String title, int publishYear, int price){
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
    }

    String getTitle() {
        return this.title;
    }

    int getPublishYear() {
        return this.publishYear;
    }

    int getPrice () {
        return this.price;
    }
}
