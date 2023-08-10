package LMS;

public abstract class Person {
    protected int id;
    protected String password;
    protected String address;
    protected int phoneNo;
    protected String name;

    // this number will be unique to everyone and increamented everytime a person is created
    static int currentIdNumber = 0; 

    public Person(int idNum, String name, String address, int phoneNum){
        currentIdNumber++;
        
        if(idNum==-1){
            id = currentIdNumber;
        }
        else
            id = idNum;
        
        password = Integer.toString(id);
        this.name = name;
        this.address = address;
        phoneNo = phoneNum;
    }    
    
    //to print person Info

    public void PrintInfo(){
        System.out.println("----------------------");
        System.out.println("\nThe details: \n ");
        System.out.println("ID:"+ id);
        System.out.println("Name:"+ name);
        System.out.println("Address:"+ address);
        System.out.println("Phone no"+ phoneNo +"\n");
    }

    public void Setaddress(String address){
        this.address = address;
    }

    public void SetPhoneNo(int phoneNo){
        this.phoneNo = phoneNo;
    }
    // public void SetPassword(String password){
    //     this.password = password;
    // }
    
    public void SetName(String name){
        this.name = name;
    }

    public int GetPhoneNo(){
        return phoneNo;
    }
    public String GetName(){
        return name;
    }
    public String GetAddress(){
        return address;
    }
    public String GetPassword(){
        return password;
    }
    public static void setIDCount(int id){
        currentIdNumber = id;
    }

}
