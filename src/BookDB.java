import java.util.HashMap;

public class BookDB extends HashMap<Long,Book> {
    private Book book;

    public BookDB() {
        super();
        book = null;
        this.initialDatabase();
    }

    public BookDB(Long SKU) {
        this();
        if (this.containsKey(SKU))
            this.book = this.get(SKU);
    }

    public String getDisplayText() {
        if (book == null)
            return "No book to display";
        else
            return book.getDisplayText();
    }

    public String toString() {
        return this.getDisplayText();
    }

    protected void initialDatabase() {
        this.put(
                543210001L,
                new Book(
                        "Basic Java",
                        "Victor",
                        "Just a basic java book",
                        100.00f,
                        true
                    )
                );
        this.put(
                543210002L,
                new Book(
                        "Advance Java",
                        "Alton",
                        "Just a advance java book",
                        200.00f,
                        true
                )
        );
        this.put(
                543210003L,
                new Book(
                        "Spring Boot",
                        "Alton",
                        "Just a java Spring boot book",
                        300.00f,
                        false
                )
        );
    }

    public Book getBook() {
        return book;
    }

}
