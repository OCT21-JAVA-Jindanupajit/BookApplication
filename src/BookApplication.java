public class BookApplication {


    public static void main(String[] args) {
        Book book = new Book(
                "Java SE 8",
                "Victor",
                "Basic Java Tutorial",
                1250.25f,
                true);

        System.out.printf("Using method getDisplayText()\n%s\n\n", book.getDisplayText());

        System.out.printf("Using toString() auto casting\n%s\n\n", book);

        Float price;

        book.setInStock(true);
        price = book.getPrice(5);
        System.out.printf("Price for 5 books is %s\n\n",(price > 0)?price:"<Out of stock>");

        book.setInStock(false);
        price = book.getPrice(5);
        System.out.printf("Price for 5 books when it is out of stock is %s\n\n",(price > 0)?price:"<Out of stock>");

        BookDB bookDB = new BookDB(543210003L);

        System.out.println("Database\n--------");
        bookDB.forEach( (SKU,eachBook) -> {
            System.out.printf("SKU: %d\nBook Detail:\n%s\n",SKU,eachBook);
        } );

        System.out.printf("The pointer points to this book: %s", bookDB.getBook());
    }
}
