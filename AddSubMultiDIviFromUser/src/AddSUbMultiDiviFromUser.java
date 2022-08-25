import java.util.Scanner;

public class AddSUbMultiDiviFromUser {

	public static void main(String[] args) {
		String result= "Result";
		System.out.println("Please enter first Number:");
		Scanner scan = new Scanner(System.in);
		double firstNumber = scan.nextInt();
		System.out.println("Please Enter Second Number:");
		Scanner scan1 = new Scanner(System.in);
		double secondNumber = scan1.nextInt();
		System.out.println("Please Enter your desired Operation (A)ddition,(S)ubstraction,(D)ivision ,(M)ultiplication");
		Scanner scan2 = new Scanner(System.in);
		String operation = scan2.nextLine();
		if(operation.equals("A")) { // == WONT WORK AS IT IS STRING TYPE
			System.out.println(firstNumber+secondNumber);
		}
		if(operation.equals("S")) {
			System.out.println(firstNumber-secondNumber);
		}
		if(operation.equals("D")) {
			System.out.println(firstNumber/secondNumber);
		}
		if(operation.equals("M")) {
			System.out.println(firstNumber*secondNumber);
		}
		
}

	}


