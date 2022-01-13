package model;

public class BBManagement {
    public static int totalBook;
    private Reader reader;
    private Book[] listBook = new Book[totalBook];
    private int[] numofBook;

    public void muonSach(Reader reader, Book[] listBook, int[] numofBook){
        this.reader = reader;
        this.listBook = listBook;
        this.numofBook = numofBook;
    }

    public BBManagement(Reader reader, Book[] listBook, int[] numofBook) {
        this.reader = reader;
        this.listBook = listBook;
        this.numofBook = numofBook;
    }

    public BBManagement() {
    }

    public Reader getReader() {
        return reader;
    }

    public void setBandoc(Reader reader) {
        this.reader = reader;
    }

    public Book[] getListBook() {
        return listBook;
    }

    public void setNumofBook(Book[] listBook) {
        this.listBook = listBook;
    }

    public int[] getNumofBook() {
        return numofBook;
    }

    public void setNumofBook(int[] numofBook) {
        this.numofBook = numofBook;
    }

    public int getAllBook(){
        int sum =0;
        for( int i =0; i< numofBook.length; i++){
            sum = sum + numofBook[i];
        }
        return sum;
    }

    public void inMuonSach() {
        System.out.println("------------------------------------------");
        for (int i = 0; i < totalBook; i++) {
            System.out.println(reader.getReaderID() + " | " + listBook[i].getBookId() + " | " + numofBook[i]);
        }
    }
}