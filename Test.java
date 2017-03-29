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
		//char gender = getUserInput.next().charAt(0);

		if (/*gender == 'M' || gender == 'm'*/ gender.equals("M") || gender.equals("m")) {
			System.out.println("Welcome Mr. " + name);			
		}	else if (/*gender == 'F' || gender == 'f'*/ gender.equals("F") || gender.equals("f")) {
			System.out.println("Are You Married?(Type 'Y' for Yes and 'N' for no.)");
			//char maritalstatus = getUserInput.next().charAt(0);
			String maritalstatus = getUserInput.nextLine();

			if (/*maritalstatus == 'Y' || maritalstatus == 'y'*/ maritalstatus.equals("Y") || maritalstatus.equals("y")) {
				System.out.println("Welcome Mrs. " + name);
			}	else {
				System.out.println("Welcome Miss " + name);
			}
		}	else if (gender.equals("O") || gender.equals("o")) {
			System.out.println("Welcome " + name);
		}	else {
			System.out.println("Invalid Input");
		}

		
		//System.out.print("Please Provide Your Age: ");

		//int age = getUserInput.nextInt();

		//double number1 = getUserInput.nextDouble();
		//double number2 = getUserInput.nextDouble();

		//System.out.println("You Have Given " + number1 + " and " + number2 + " And their sum is: " + (number1 + number2));

		
		//System.out.println("You Are " + age + " Years Old");

		/*System.out.println("The Followinng is My Info");
		System.out.println("Name: Md. Shadman Hasan");
		System.out.println("Dept.: Information and Communication Engineering");
		System.out.println("Roll No.: 14065642");
		System.out.println("Reg. No.: 14HRH1143");*/
		}	
}