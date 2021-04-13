package exe5;

public class Book {
    private String name;
    Author author;
    private double price;
    private int qty;

    public Book (String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor () {
        return author;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public int getQty () {
        return qty;
    }

    public void setQty (int qty) {
        this.qty = qty;
    }

    public String toString () {
        return "Name book is : " + name + " by " + author;

    }

    public static void main(String[] args) {
        Author a = new Author("chu duc long", "chuduclong29062000@gmail.com", 'm');
        Book b = new Book("English", a, 200, 3);

        System.out.println("Name book is : " + b.getName());
        System.out.println("Price book is : " + b.getPrice());
        System.out.println("Qty book is : " + b.getQty());
        System.out.println(b);
        System.out.println("--------------------");
        b.setPrice(100);
        b.setQty(5);
        System.out.println("Name book is : " + b.getName());
        System.out.println("Price book is : " + b.getPrice());
        System.out.println("Qty book is : " + b.getQty());
        System.out.println("Gmail author is : " + b.getAuthor().getGmail());
        System.out.println("gender author is : " + b.getAuthor().getGender());
        System.out.println(b);
        System.out.println("----------------------------");
        Book b1 = new Book("Math", new Author("chu duc long", "chuduclong29062000@gmail.com", 'm'), 23, 4);
        System.out.println(b1);
    }
}
