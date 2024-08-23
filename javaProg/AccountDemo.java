import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
       int accNumber, bBalance, itemCharges, tCredit, newBalance, credits;
	
		System.out.print("Enter Your AccNumber: ");
		Scanner scan = new Scanner(System.in);
		accNumber = scan.nextInt();
		
		System.out.print("Enter Your Balance of this Month: ");
		bBalance = scan.nextInt();
		
		System.out.print("Enter Your TotalItems Charges:  ");
		itemCharges = scan.nextInt();
		
		System.out.print("Enter The Total credit applied to You: ");
                tCredit = scan.nextInt();
                
                newBalance = bBalance - itemCharges - tCredit;
               System.out.println("Your New Balabce:"+newBalance);
               
               if(newBalance < 100){
                     System.out.println("Credit Limit Exceded");
                } else {
                    System.out.println("Thanks for Using our app");
        }
		
    }
}