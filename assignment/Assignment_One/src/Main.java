import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();
		System.out.println("The resulting string is:" + stringReplace(str));
		sc.close();
	}

	public static String stringReplace(String str) {
		// TODO Auto-generated method stub
		char[] ch = new char[str.length()];  
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i);
            if(i < str.length() - 4)
            {
            	ch[i] = 'X';
            }
	}
        String result = new String(ch);
        return result;
}
}