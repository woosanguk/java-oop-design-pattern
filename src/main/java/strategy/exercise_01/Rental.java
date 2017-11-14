package strategy.exercise_01;

/**
 * Created by sanguk on 10/11/2017.
 */
public class Rental {
    private Member member;
    private Book book;
    private PriceStrategy priceStrategy;
    private int numberOfBook;

    public Rental(Member member, Book book, PriceStrategy priceStrategy, int numberOfBook) {
        this.member = member;
        this.book = book;
        this.priceStrategy = priceStrategy;
        this.numberOfBook = numberOfBook;
        this.member.addRentalPrice(priceStrategy.calcPrice(this.book.getPrice(), numberOfBook));
    }

    int getPrice() {
        return priceStrategy.calcPrice(this.book.getPrice(), this.numberOfBook);
    }
}
