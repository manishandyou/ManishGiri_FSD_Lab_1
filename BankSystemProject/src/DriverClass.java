import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.Banking;

public class DriverClass {

	
	public static void main(String[] args) {
		
		
		
		Customer c1 = new Customer();
		Banking b1 = new Banking();
		//System.out.println(c1.getCustomername());
		
		Customer c2 = new Customer("Ritu", 68222, 9000, "ritu123");
		//System.out.println(c2.getCustomername());
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Balance before deposit : " + c2.getBalance()); //9000
		
		b1.deposit(c2, 100);
		System.out.println("Balance after deposit : " + c2.getBalance()); //9100
		System.out.println(c1.getCustomername() + " Balance before withdrawal : " + c1.getBalance());
		b1.withdraw(c1,500);
		System.out.println(c1.getCustomername() + " Balance after withdrawl : " + c1.getBalance());
		
		
		
		
		
	}
}
