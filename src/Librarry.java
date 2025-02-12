//import java.util.Scanner;
//
//class Library {
//    Book[] books;
//    int indexFree;
//
//    public Library() {
//        this.indexFree = 0;
//        this.books = new Book[10];
//    }
//
//    public void addBook(String author, String title){
//        if (indexFree < 10) {
//            Book k = new Book(author, title, true);
//            books[indexFree] = k;
//            indexFree++;
//        }
//        else {
//            System.out.println("Library Full");
//        }
//    }
//    public void addBook(Book book){
//        if (indexFree < 10) {
//            books[indexFree] = book;
//            indexFree++;
//        }
//    }
//
//    public void borrowBook(String author, String title){
//        for (Book k: books){
//            if (k.getAuthor().equals(author) && k.getTitle().equals(title)) {
//                k.setAvaliable(false);
//            }
//            else {
//                break;
//            }
//        }
//
//    }
//    public void returnBook(String author, String title){
//        for (Book k: books){
//            if (k!=null){
//                if (k.getAuthor().equals(author) && k.getTitle().equals(title)) {
//                    k.setAvaliable(true);
//                }
//            }
//            else {
//                break;
//            }
//        }
//    }
//    public void showBooks(){
//        for (Book k: books){
//            if (k!=null){
//                System.out.println(k.getTitle() + ", " + k.getAuthor());
//            }
//            else {
//                break;
//            }
//        }
//
//    }
//    public void replaceBook(String authorOld, String titleOld, String authorNew, String titleNew){
//        for (Book k: books){
//            if (k!= null && k.getAuthor().equals(authorOld) && k.getTitle().equals(titleOld) && k.getAvaliable()) {
//                k.setAuthor(authorNew);
//                k.setTitle(titleNew);
//            }
//        }
//    }
//}
//
//class testLibrary {
//    public static void main(String[] args) {
//        Library library = new Library();
//        Book book1 = new Book("Book 1", "Author 1", true);
//        Book book2 = new Book("Book 2", "Author 2", true);
//        library.addBook(book1);
//        library.addBook(book2);
//        Scanner scan  = new Scanner(System.in);
//        while(true){
//            System.out.println("Library options:" + "\n" + "1. List all available books" + "\n" + "2. Add a new book" + "\n" + "3. Return book" + "\n" + "4. Exit program" + "\n");
//
//            int choice = scan.nextInt();
//            switch (choice) {
//                case 1:
//                    library.showBooks();
//                case 2:
//                    System.out.println("Enter author name");
//                    String name = scan.nextLine();
//                    System.out.println("Enter title");
//                    String author = scan.nextLine();
//                    library.addBook(name, author);
//                case 3:
//                    System.out.println("Enter author name");
//                    String name1 = scan.nextLine();
//                    System.out.println("Enter title");
//                    String author1 = scan.nextLine();
//                    library.returnBook(name1, author1);
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////public class Librarry {
////
////}
////
////class Library {
////    Book[] books;
////
////
////
////    public Book[] getAvailableBooks() {
////        Book[] ava = new Book[books.length];
////        int count = 0;
////
////        for (int i = 0; i < books.length; i++) {
////            if (books[i].getAvaliable()){
////                ava[count] = books[i];
////                count++;
////
////        }}
////        Book[] result = new Book[count];
////        for (int i = 0; i < count; i++) {
////            result[i] = ava[i];
////        }
////        return result;
////    }
////    public void borrowBook(String title) {
////        for (int i = 0; i < books.length; i++) {
////            if (books[i].getTitle() == title && books[i].getAvaliable()) {
////                books[i].setAvaliable(false);
////            }
////        }
////    }
////
////    public Book[] getBooks() {
////        Book[] result = new Book[books.length];
////        for (int i = 0; i < books.length; i++) {
////            result[i] = books[i].getTitle();
////        }
////    }
////}
////
//class Book1 {
//    private String title;
//    private String author;
//    private Boolean isAvaliable;
//
//    public Book(String title, String author, Boolean isAvaliable) {
//        this.title = title;
//        this.author = author;
//        this.isAvaliable = isAvaliable;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    public String getAuthor() {
//        return author;
//    }
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//    public Boolean getAvaliable() {
//        return isAvaliable;
//    }
//    public void setAvaliable(Boolean isAvaliable) {
//        this.isAvaliable = isAvaliable;
//    }}