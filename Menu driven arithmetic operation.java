//Grade Marks
package quiz;
import java.util.*;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu\n");
		System.out.println("1.ADD\n");
		System.out.println("2.SUB\n");
		System.out.println("3.MUL\n");
		System.out.println("4.DIV\n");

		System.out.println("Enter 2 numbers");
		int i=sc.nextInt();
		int j=sc.nextInt();
		sc.nextLine();
		System.out.println("Your Option Here:");
		String option=sc.nextLine();

		option=option.toUpperCase();
		 switch(option)
		 {
		 	case "ADD": System.out.println("Sum is:"+(i+j));
		 				break;
		 	case "SUB": System.out.println("Difference is:"+(i-j));
						break;
		 	case "MUL": System.out.println("Product is:"+(i*j));
						break;
		 	case "DIV": System.out.println("Ratio is:"+(i/j));
						break;
		 	default	  : System.out.println("Invalid Option");	
		 				break;
		 }
			 
	
		
	}

}
