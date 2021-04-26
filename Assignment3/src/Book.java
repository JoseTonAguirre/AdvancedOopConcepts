public abstract class Book {
    String title;
    double price;
    Book() {
    }
    public Book(String title)
    {
        this.title = title;
    }
    public Book(String title, double price)
    {
        this.title = title;
        this.price = price;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
}
