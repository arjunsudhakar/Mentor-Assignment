import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		StringBuilder sb = new StringBuilder();
		sb.append(sc.nextLine());
		System.out.println("The resulting string is:" + stringReplace(sb));
		sc.close();
	}

	public static String stringReplace(StringBuilder sb) {
		// TODO Auto-generated method stub  
        for (int i = 0; i < sb.length(); i++) { 
            if(i < sb.length() - 4)
            {
            	sb.replace(i,i+1, "X");
            }
	}
        return sb.toString();
}
}