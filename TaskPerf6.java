import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskPerf6 {
	public static void main(String[] args) {
		System.out.println("ACCOUNT REGISTRATION!");
		accountRegistration();
	}
	static boolean isAlphaNumeric(String input) {
		String regString = "^[a-zA-Z0-9]*$";
		return input.matches(regString);
	}
	static String isInvalid(boolean _isInvalid) {
		String message = _isInvalid ? "Invalid Character! Character Must Be Alphanumeric Only!" : "" ;
		return message;
	}
	static void accountRegistration() {
		Scanner sc = new Scanner(System.in);
		String userName = null, password = null;
		boolean getUsername = true, getPassword = !getUsername;
		while(getUsername) {
			System.out.println("Please Enter Your Desired Username:");
			userName = sc.nextLine();
			getUsername = !isAlphaNumeric(userName);
			System.out.println(isInvalid(getUsername)); 
			getPassword = !getUsername;
		}
		while (getPassword) {
			System.out.println("Please Enter Your Desired Password:");
			password = sc.nextLine();
			getPassword = !isAlphaNumeric(password);
			System.out.println(isInvalid(getPassword)); 
		}
		File file = new File("records.txt");
		try {
			String isCreated = file.createNewFile() ? "Account Created!" : "Account Created!" ;
			System.out.println(isCreated);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(userName); writer.newLine();
			writer.write(password); writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("LOGIN YOUR ACCOUNT!");
		logIn(file);
		sc.close();
	}
	static void logIn(File file) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER USERNAME: ");
		String username = sc.nextLine();				
		System.out.println("ENTER PASSWORD: ");
		String password = sc.nextLine();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			if (username.equals(reader.readLine()) && password.equals(reader.readLine())) {
				System.out.println("Succesfully Logged In!");
				reader.close();
			}else {
				System.out.println("Incorrect username or password!");
				logIn(file);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	sc.close();	
	}
}
