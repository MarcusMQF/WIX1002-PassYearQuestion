class book{
    private String title;   
    private String author;
    private int year;

    public book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }


}

public class Q2a {
    public static void main(String[] args) {
        book b1 = new book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        

        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Year: " + b1.getYear());
        System.out.println();
    }
}
