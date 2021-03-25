import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of values: ");
		String[] str = new String[Integer.parseInt(sc.nextLine())];
		System.out.println("Enter the array values:");
		for(int i=0;i<str.length;i++)
		{
			str[i] = sc.nextLine();
		}
		System.out.println("The concatenated array values are: " + Concatenation(str));
		sc.close();
	}

	public static String Concatenation(String[] str) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder();
		for(String i : str)
		{
			if(i==null)
			{
				continue;
			}
			sb.append(i);
		}
		if(sb.toString().isEmpty())
		{
			sb.append("No valid elements in array");
		}
		return sb.toString();
	}

}