package LMS;

import java.util.Date;

public class HoldRequest {

    Borrower borrower;
    Book book;
    Date requestDate;

    public HoldRequest(Borrower borrower, Book book, Date date) {
        this.book = book;
        this.borrower = borrower;
        this.requestDate = date;
    }
    // getter
    public Object getBook() {
        return book;
    }
    public Date getreqDate(){
        return requestDate;
    }
    public Borrower getBorrower(){
        return borrower;
    }


    public void printInfo(){
        System.out.print(book.getTitle() + "\t\t\t\t" + borrower.GetName() + "\t\t\t\t"  + requestDate);
    }

}
