import java.util.ArrayList;

import LMS.Person;

public class Borrower extends Person{

    private ArrayList<Loan> borrowedBooks; // Already Borrowed books

    public Borrower(int idNum, String name, String address, int phoneNum) {
        super(idNum, name, address, phoneNum);
    }
    
}
