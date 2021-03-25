import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of array values: ");
		int n = Integer.parseInt(sc.nextLine());
		String[] str = new String[n];
		String[] reverse = new String[n];
		System.out.println("Enter the array values:");
		for(int i=0;i<n;i++)
		{
			str[i] = sc.nextLine();
		}
		System.out.println("The alternate elements of array are:");
		int i=0;
		for(String s : str)
		{
			if(i%2==0) //change condition to not equal to get odd indexed order (i.e str[1], str[3], etc)
			{
				System.out.println(s);
			}
			i++;
		}
		System.out.println("The reverse order of array elements are:");
		int j=n-1;
		for(String s : str)
		{
			reverse[j] = s;
			j--;
		}
		for(String s : reverse)
		{
			System.out.println(s);
		}
		sc.close();
	}
}