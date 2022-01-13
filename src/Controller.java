import model.BBManagement;
import model.Book;
import model.Reader;

import java.util.Scanner;

public class Controller {
    public static int readers;
    public static int books;
    private Book[] listBook;
    private Reader[] listReader;
    private BBManagement bbManagement;
    private BBManagement[] bbM;

    public Controller() {

    }

    public void insertReaders() {
        listReader = new Reader[readers];
        for (int i = 0; i < listReader.length; i++) {
            Reader iReader = new Reader();
            iReader.addReader();
            this.listReader[i] = iReader;
        }
    }

    public void inReader() {
        for (int i = 0; i < listReader.length; i++) {
            listReader[i].inReader();
        }
    }

    public void insertBooks() {
        listBook = new Book[books];
        for (int i = 0; i < listBook.length; i++) {
            Book iBook = new Book();
            iBook.addBook();
            this.listBook[i] = iBook;
        }
    }

    public void inBook() {
        for (int i = 0; i < listBook.length; i++) {
            listBook[i].inBook();
        }
    }

    public void borrowBooks() {
        Scanner scanner = new Scanner(System.in);
        bbM = new BBManagement[readers];

        for (int j = 0; j < bbM.length; j++) {
            int bookcheck;

            System.out.println("Thực hiện mượn cho bạn đọc: " + listReader[j].getFullName());
            System.out.println("Nhập số lượng đầu sách cần mượn:  ");
            System.out.println(" Bạn chỉ mượn được tối đa 5 đầu sách!!!");
            int numofBooktoBorrow = scanner.nextInt();

            while (numofBooktoBorrow < 1 || numofBooktoBorrow > 5 || numofBooktoBorrow > listBook.length) {
                System.out.println("Số lượng đầu sách cần mượn:  ");
                System.out.println(" Bạn chỉ mượn được tối đa 5 đầu sách!!!");
                numofBooktoBorrow = scanner.nextInt();
            }

            BBManagement.totalBook = numofBooktoBorrow;

            Book[] listBookBorrow = new Book[BBManagement.totalBook];
            int[] listBookaf = new int[BBManagement.totalBook];

            for (int i = 0; i < BBManagement.totalBook; i++) {

                System.out.println("Nhập mã sách");
                int bookIDinput = scanner.nextInt();

                for (int a = 0; a < listBook.length; a++) {
                    if (listBook[i].getBookId() - bookIDinput == 0) {
                        System.out.println("Nhập số lượng sách cần mượn:  ");
                        System.out.println("Số lượng mượn sách tối đa là 3 quyển:  ");
                        int soluong = scanner.nextInt();

                        while (soluong < 1 || soluong > 3) {
                            System.out.println("Nhập số lượng sách cần mượn:  ");
                            System.out.println("Số lượng mượn sách tối đa là 3 quyển:  ");
                            soluong = scanner.nextInt();
                        }
                        listBookaf[i] = soluong;
                        bookcheck = bookIDinput;
                    }
                }

                bbManagement = new BBManagement(listReader[j], listBookBorrow, listBookaf);
                bbM[j] = bbManagement;
            }
        }


    }
    public void inDanhSachMuonSach () {
        for (int i = 0; i < bbM.length; i++) {
            bbM[i].inMuonSach();
        }
    }
}