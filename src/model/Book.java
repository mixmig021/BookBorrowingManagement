package model;

import java.util.Scanner;

public class Book {
    private static int id = 10000;
    private int bookId;
    private String bookName;
    private String author;
    private String specialized;
    private int publishYear;

    public Book(){
        this.bookId = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Book.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Book(int bookId, String bookName, String author, String specialized, int publishYear) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.specialized = specialized;
        this.publishYear = publishYear;
    }

    public  void addBook(){
        id++;
        String[] specs = { "Văn học–Nghệ thuật","Khoa học tự nhiên", "Điện tử Viễn"
                + "thông", "Công nghệ thông tin"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Nhập tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.print("\n Nhập tác giả: ");
        this.author = scanner.nextLine();

        int inputSpecialized;

        do {
            System.out.println("Nhập thể loại sách: ");
            System.out.print("\n Nhập chuyên nghành: ");
            System.out.print("\n    1. Văn học-Nghệ Thuật ");
            System.out.print("\n    1. Khoa học tự nhiên ");
            System.out.print("\n    2. Điện Tử ViễnThông ");
            System.out.print("\n    3. Công Nghệ Thông Tin \n");
            inputSpecialized = scanner.nextInt();
        } while (inputSpecialized < 1 || inputSpecialized > 4);

        this.specialized = specs[inputSpecialized-1];

        System.out.print("Nhập năm xuất bản: ");
        this.publishYear = scanner.nextInt();

    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", specialized='" + specialized + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    public void inBook() {
        System.out.println("------------------------------------------");
        System.out.println( this.bookId + " \t|\t " + this.bookName + " \t|\t " + this.author + " \t|\t "
                + this.specialized + " \t|\t " + this.publishYear);
    }


}
