package ArrayBank;

public class Branch1 extends Bank1 {
    String branchname;
    int branchid;
    long phoneNumber;
    private long branchBankTotalFund;
    private  float branchBankInterest;


    public void loan(){
        System.out.println("Branch Name is:");
        branchname = "Axisbank";
        System.out.println(branchname);
        branchid=123;
        System.out.println(" your Branch ID");
        System.out.println(branchid);
        totalInterest();
        checkLoan();
    }

    
}
