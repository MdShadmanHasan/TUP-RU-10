import java.util.*;

public class Test {
	public static void main(String ... args) {
		System.out.print("Please Provide Your Name: ");
		Scanner getUserInput = new Scanner(System.in);
		String name = getUserInput.nextLine();

		System.out.println("Please Type 'M' for Male");
		System.out.println("Please Type 'F' for Female");
		System.out.println("Please Type 'O' for Other");
		System.out.print("Please Provide Your Gender: ");

		String gender = getUserInput.nextLine();

		if (gender.equals("M") || gender.equals("m")) {
			System.out.println("Welcome Mr. " + name);			
		}	else if (gender.equals("F") || gender.equals("f")) {
			System.out.println("Are You Married?(Type 'Y' for Yes and 'N' for no.)");

			String maritalstatus = getUserInput.nextLine();

			if (maritalstatus.equals("Y") || maritalstatus.equals("y")) {
				System.out.println("Welcome Mrs. " + name);
			}	else {
				System.out.println("Welcome Miss " + name);
			}
		}	else if (gender.equals("O") || gender.equals("o")) {
			System.out.println("Welcome " + name);
		}	else {
			System.out.println("Invalid Input");
		}
	}	
}