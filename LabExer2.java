import java.util.*;

public class LabExer2 {
	String itemName;
	double itemPrice, amountDue;
	int itemQuantity;
	
	public void setItemName(String newItemName) {
		this.itemName = newItemName;
	}
	public void setTotalCost(int quantity, double price) {
		this.itemQuantity = quantity;
		this.itemPrice = price;
		this.amountDue = price * quantity;
	}
	public String getItemName() {
		return itemName;
	}
	public Double getTotalCost() {
		return amountDue;
	}
	public void readInput() {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the name of the item you are purchasing.");
		setItemName(s.nextLine());
		System.out.println("Enter the quantity and price separated by a space.");
		setTotalCost(s.nextInt(), s.nextDouble());
		s.close();
		writeOutput();
	}
	public void writeOutput() {
		System.out.println("You are purchasing " + itemQuantity + " " + itemName + "(s) at " + itemPrice + " each.");
		System.out.printf("Amount Due is " + "%.2f", amountDue);
	}
	public static void main(String[] args) {
		LabExer2 invokingNonStatic = new LabExer2();
		invokingNonStatic.readInput();
	}
}
