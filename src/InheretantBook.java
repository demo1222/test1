class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getBook() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear Published: " + year;
    }

    public void printBook() {
        System.out.println(getBook());
    }
}

class PrintedBook extends Book {
    private int numberOfPages;
    private String publisher;

    public PrintedBook(String title, String author, int year, int numberOfPages, String publisher) {
        super(title, author, year);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    @Override
    public String getBook() {
        return super.getBook() + "\nPages: " + numberOfPages + "\nPublisher: " + publisher;
    }

    @Override
    public void printBook() {
        System.out.println(getBook());
    }

    public void bookType() {
        System.out.println("Printed Book Info:");
    }

}

class EBook extends Book {
    private double fileSize;
    private String fileFormat;

    public EBook(String title, String author, int year, double fileSize, String fileFormat) {
        super(title, author, year);
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;

    }

    @Override
    public String getBook() {
        return super.getBook() + "\nFile Size: " + fileSize + " MB\nFile Format: " + fileFormat;
    }

    @Override
    public void printBook() {
        System.out.println(getBook());
    }

    public void bookType() {
        System.out.println("EBook Info:");
    }
}

public class InheretantBook {
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook("Hary poter", "rowling", 1999, 320, "USSR");
        EBook eBook = new EBook("Running on java", "Zarylbek", 2077, 93193, "JPG");

        printedBook.bookType();
        printedBook.printBook();
        System.out.println();
        eBook.bookType();
        eBook.printBook();

    }
}
