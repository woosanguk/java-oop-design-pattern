package strategy.exercise;

/**
 * Created by sanguk on 10/11/2017.
 */
public class Client {
    public static void main(String args[]){
        Member member = new Member("sanguk");
        Book book1 = new Book("chapter1", 1985, 13000);
        Rental rental = new Rental(member, book1, new OrdinaryPriceStrategy(), 2);
        System.out.println(rental.getPrice());
    }
}
