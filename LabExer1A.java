import java.util.ArrayList;
import java.util.Scanner;
public class LabExer1A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = sc.nextLine();
		
		System.out.println("Type your favorite number: ");
		int faveNum = sc.nextInt();
		
		System.out.println("Type your favorite cartoon / anime character: ");
		
		String a = sc.nextLine();
		String faveCartChar = sc.nextLine();
		System.out.println("Type your middle initial: ");
		char mi = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Type your nickname: ");
		String nickName = sc.nextLine();
		
		printNum(faveNum);
		printFaveCartChar(faveCartChar);
		printMI(firstName, lastName, mi);
		convertAndPrintNickName(nickName);
	}
	
	static void printNum(int faveNum) {
		System.out.println(faveNum + " is my favorite number.");
	}
	static void printFaveCartChar(String cartChar) {
		System.out.println("I love " + cartChar + "!");
	}
	static void printMI(String firstname, String surname, char MI) {
		System.out.println("My name is " + firstname + " " + MI + ". " + surname);
	}
	static void convertAndPrintNickName(String toConvert) {

		char[] convertedNickName = new char[toConvert.length()];

		for(int i = 0; i < toConvert.length(); i++) {
			convertedNickName[i] = toConvert.charAt(i);
		}
		
		System.out.print("You can call me ");
		for (int i = 0; i < convertedNickName.length; i++) {
			System.out.print(convertedNickname[i]);
		}
		System.out.print(".");
	}
}
