import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class GameConfig{
	private File file = new File("words.txt");
	ArrayList<String> words;
	class GameFiles{
		public void setUpFile() {
			//create file and add this list of word.
			// TO ADD: check if "words.txt" - file already exists ? create : do nothing ; 
			String[] wordList = {"Programming", "Computer Science", "Technology", "Information", "Artificial Intelligence", "EDUCATION"};
			try {
				file.createNewFile();
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				for(String word : wordList) {
					writer.write(word);
					writer.newLine();
				}writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
		public void fetchData() {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String fetchedWord;
				words = new ArrayList<>();
				while((fetchedWord = reader.readLine()) != null) {
					words.add(fetchedWord);
				}reader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void setupGame() {
		GameFiles gameFile = new GameFiles();
		gameFile.setUpFile();
		gameFile.fetchData();
	}
}
public class LabExer6A {
	public static void main(String[] args) {
		GameConfig configGame = new GameConfig();
		configGame.setupGame();
		int randomNum = (int)(Math.random() * configGame.words.size());
		String guessWord = configGame.words.get(randomNum).toUpperCase();
		renderGame(guessWord);
	}
	static void renderGame(String guessWord) {
		boolean isGameOver = !false;
		String hideWord = guessWord.replaceAll("[a-zA-Z0-9]", "?");
		System.out.println(hideWord);
		Scanner sc = new Scanner(System.in);	
		char[] a = hideWord.toCharArray();
		ArrayList<Character> letterGuessed = new ArrayList<>();
		String showLetter = "";
		while(isGameOver) {
			System.out.print("Guess the Word: ");
			String guess = sc.nextLine().toUpperCase();
			if(guess.length() != 1) { System.out.println("Next Time, Please Input One Character at a Time!"); }
//			isExist = guessWord.indexOf(guess) == -1 ? false : true;
			if(!(guessWord.indexOf(guess) == -1)) {
				if(letterGuessed.contains(guess.charAt(0))) {
					System.out.println("Already Guessed!");
				}else {
					System.out.println("Correct Guessed!");								
					letterGuessed.add(guess.charAt(0));
					for (int i = 0; i < a.length; i++) {
						if(guess.charAt(0) == guessWord.charAt(i)) {
							a[i] = guess.charAt(0);
							showLetter = new String(a);
							if (showLetter.equals(guessWord)) { 
								System.out.println("Congratulations! You Guessed the Hidden Word!".toUpperCase()); 
								System.out.println(showLetter);
								sc.close();
								return;
							}
						}
					}
				} System.out.println(showLetter + "\n");
			}else { System.out.println("Incorrect Guessed!\n"); }
		}sc.close();
	}
}
