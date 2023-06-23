import java.util.Scanner;
public class ThreadDemo {
	
	public static void main(String[] args) {
		 //09 Hands-on Activity 1
		Scanner sc = new Scanner(System.in);
		Thread thread1 = new Thread();
		Thread thread2 = new Thread();
		System.out.print("Name your first thread: ");
		thread1.setName(sc.next());
		System.out.print("Name your second thread: ");
		thread2.setName(sc.next());
		run(thread1, thread2);
		sc.close();
	}
	public static void run(Thread t1, Thread t2) {
		String thread1 = t1.getName();
		String thread2 = t2.getName();
		
		displayState(thread1, thread2, t1, t2);
		System.out.println("\nStarting the threads...");
		t1.start();
		t2.start();
		displayState(thread1, thread2, t1, t2);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nAfter sleep...");
		displayState(thread1, thread2, t1, t2);
		
	}
	public static void displayState(String tName1,  String tName2, Thread thread1, Thread thread2) {
		System.out.println(tName1 + " is " + thread1.getState());
		System.out.println(tName2 + " is " + thread2.getState());
	}
}
