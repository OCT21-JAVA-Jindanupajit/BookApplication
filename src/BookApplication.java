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

    }
}
