public class Book {
    private String SKU;
    private String title;
    private String author;
    private String description;
    private Float price;
    private boolean inStock;


    public Book() {
    }

    public Book(String SKU, String title, String author, String description, Float price, boolean inStock) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inInStock) {
        this.inStock = inInStock;
    }

    public String getDisplayText() {
        return String.format("Author: %s\nTitle: %s\nDescription: %s\n",
                this.author, this.title, this.description);
    }

    @Override
    public String toString() {
        return getDisplayText();
    }

    public Float getPrice(int count) {
        if (this.inStock)
            return this.price*count;
        else
            return -1f;
    }
}
