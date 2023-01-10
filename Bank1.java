package ArrayBank;
import java.util.Scanner;
public class Bank1 {
    String name,UserName;
    String UserPlace;
    int userLoanAmount;
    int id,count=0,index;
    long phoneNumber;
    private final int totalFund = 1000000;
    private final float bankInterest = 5.5f;
    Bank1 arrayUser[];


Scanner scan = new Scanner(System.in);
    public void checkLoan(){
        System.out.println("Enter the amount of Loan");
        int loan = scan.nextInt();
        if (loan <=totalFund){
            System.out.println("Loan is approved ");
            Choice();

        }
        else {
            System.out.println("Not approved");
        }
    }

    public void totalInterest(){
        System.out.println("Enter the Branch Interest Rate");
        float branchBankInterest = scan.nextFloat();
        float total = bankInterest + branchBankInterest;
        System.out.println("Total Interest=" +" " + total+"%");
    }
    public void AddUser(){
        Scanner sc = new Scanner(System.in);
        Bank1 obj1=new Bank1();
        System.out.println("Enter name:");
        obj1.UserName=sc.next();
        System.out.println("Enter age:");
        obj1.userLoanAmount=sc.nextInt();
        System.out.println("Enter place:");
        obj1.UserPlace=sc.next();
        arrayUser[count]=obj1;
        count++;
        }
        public void displayUser(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the User number:");
            int index=sc.nextInt();
            Bank1 User1=arrayUser[index];
            System.out.println("Enter name:"+User1.UserName);
            System.out.println("Enter age:"+User1.userLoanAmount);
            System.out.println("Enter place:"+User1.UserPlace);

}
public void Choice(){
    Scanner sc=new Scanner(System.in);
    Bank1 user=new Bank1();
    
    System.out.println("Enter size of array");

    int n = sc.nextInt();

    user.arrayUser = new Bank1[n];
    

    while(true){
        System.out.println("Enter Case\n 1:addApproveUSerDetails\n 2:Display\n 3:exit\n 4:NewLoanCheck");
        //Bank1 obj2=new Bank1();
        int choice=sc.nextInt();
        switch (choice) {

            case 1:

                user.AddUser();

                break;

            case 2:

                user.displayUser();

                break;

            case 3:

                System.exit(1);
            case 4:
            System.out.print("\nCheck New Loan\n");
                checkLoan();


        }

        
       

    }
}}
    

