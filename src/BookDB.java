import java.util.HashMap;

public class BookDB extends HashMap<String,Book> {
    private Book book;

    public BookDB() {
        super();
        book = null;
        this.initialDatabase();
    }

    public BookDB(String SKU) {
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
                "Java1001",
                new Book(
                        "Java1001",
                        "Head First Java",
                        "Kathy Sierra and Bert Bates",
                        "Easy to read Java workbook",
                        47.50f,
                        false
                    )
                );
        this.put(
                "Java1002",
                new Book(
                        "Java1002",
                        "Thinking in Java",
                        "Bruce Eckel",
                        "Details about Java under the hood",
                        20.0f,
                        false
                )
        );
        this.put(
                "Orcl1003",
                new Book(
                        "Orcl1003",
                        "OCP: Oracle Certified Professional Java SE",
                        "Jeanne Boyarsky",
                        "Everything you need to know in one place",
                        45.00f,
                        false
                )
        );
        this.put(
                "Python1004",
                new Book(
                        "Python1004",
                        "Automate the Boring Stuff with Python",
                        "Al Sweigart",
                        "Fun with Python",
                        10.50f,
                        false
                )
        );
        this.put(
                "Zombie1005",
                new Book(
                        "Zombie1005",
                        "The Maker's Guide to the Zombie Apocalypse",
                        "Simon Monk",
                        "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",
                        16.50f,
                        false
                )
        );
        this.put(
                "Rasp1006",
                new Book(
                        "Rasp1006",
                        "Raspberry Pi Projects for the Evil Genius",
                        "Donald Norris",
                        "A dozen fiendishly fun projects for the Raspberry Pi!",
                        14.75f,
                        false
                )
        );
    }

    public Book getBook() {
        return book;
    }

    public Book getBookBySKU(String SKU) {
        if (this.containsKey(SKU))
            return this.get(SKU);
        else
            return null;
    }

}
