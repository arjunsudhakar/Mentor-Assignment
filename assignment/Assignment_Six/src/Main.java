import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		System.out.println("The no. of vowels in the given string is: " + countVowels(ch));
		sc.close();
	}

	public static int countVowels(char[] ch) {
		// TODO Auto-generated method stub
		int count = 0;
		for (char c : ch) {
			try {
				if (c == 'x') {
					throw new IOException();
				}
			} catch (IOException e) {
				System.out.println("The string contains the letter x");
			}
			if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i'
					|| Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
				count++;
			}
		}
		return count;
	}
}