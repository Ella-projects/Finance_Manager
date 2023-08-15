package LMS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Borrower extends Person{

    private ArrayList<Loan> borrowedBooks; // Already Borrowed books
    private ArrayList<HoldRequest> onholdbooks; // books requested to be on hold

    public Borrower(int idNum, String name, String address, int phoneNum) {
        super(idNum, name, address, phoneNum);

        onholdbooks = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
    }

    // requesting a book to be on hold
    public void addHoldRequest(HoldRequest hr){
        onholdbooks.add(hr);
    }

    // printing borrower info
    @Override
    public void PrintInfo(){

        super.PrintInfo();

        System.out.println(borrowedBooks);
        System.out.println(onholdbooks);
    }

    // Printing books info borrowed by person
    public void PrintBookInfo(){

        if(!borrowedBooks.isEmpty()){

            System.out.println("--------------------");
            System.out.println("\nThe books borrowed are:");

            for(int i=0; i < borrowedBooks.size();i++){
                borrowedBooks.get(i).getBook().PrintInfo();
                System.out.println("--------------------");
            }

        }else{
            System.out.println("No Books Borrowed");
        }

    }

    // printing on hold books info placed by borrower
    public void printonHoldRequest(){

        if(!onholdbooks.isEmpty()){

            System.out.println("---------------------");
            System.out.println("The books held are as follows");

            for(int i = 0; i<onholdbooks.size(); i++){
                onholdbooks.get(i).getBook().printInfo();
                System.out.println("\n");
            }
        }else{

            System.out.println("---------------------");
            System.out.println("No books on hold");;
        }

    }

    // Updating borrowers info
    public void UpdateBorrowersInfo() throws IOException{
        String choice;

        Scanner Keyboard = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nDo you want to update " + GetName() + "'s Name ? (y/n)");  
        choice = Keyboard.next();

        updateBorrowerName(choice, reader);

        System.out.println("\nDo you want to update " + GetName() + "'s Address ? (y/n)");  
        choice = Keyboard.next();

        updateBorrowerAddress(choice, reader);

        System.out.println("\nDo you want to update " + GetName() + "'s Phone Number ? (y/n)");  
        choice = Keyboard.next();

        updateBorrowerPhoneNumber(choice, Keyboard);

        System.out.println("\nBorrower is successfully updated.");
    }

    private void updateBorrowerPhoneNumber(String choice, Scanner sc) {
        if(choice.equals("y"))
        {
            System.out.println("\nType New Phone Number: ");
            SetPhoneNo(sc.nextInt());
            System.out.println("\nThe phone number is successfully updated.");
        }
    }

    private void updateBorrowerAddress(String choice, BufferedReader reader) throws IOException {
        if(choice.equals("y"))
        {
            System.out.println("\nType New Address: ");
            Setaddress(reader.readLine());
            System.out.println("\nThe address is successfully updated.");
        }
    }

    private void updateBorrowerName(String choice, BufferedReader reader) throws IOException {
        if(choice.equals("y"))
        {
            System.out.println("\nType New Name: ");
            SetName(reader.readLine());
            System.out.println("\nThe name is successfully updated.");
        }
    }
    // Adding and removing borrowed books

    public void addBorrowedBooks(Loan book){
        borrowedBooks.add(book);
        System.out.println("\nBook is successfully added.");
    }

    public void removeBorrowedBooks(Loan book){
        borrowedBooks.remove(book);
        System.out.println("\nBook is successfully removed.");
    }

    // Removing and adding books on hold
    public void addHoldBooks(HoldRequest hr){
        onholdbooks.add(hr);
    
    }
    public void removeholdBooks(HoldRequest hr){
        onholdbooks.remove(hr);
    }

    // getter
    public ArrayList<Loan> getBorrowedBook(){
        return borrowedBooks;
    }
    public ArrayList<HoldRequest> getonHoldBooks(){
        return onholdbooks;
    }
}
