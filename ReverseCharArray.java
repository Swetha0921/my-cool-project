import java.util.Scanner;
public class ReverseCharArray
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char ch[]=new char[n];
		for(int i=0;i<n;i++)
		{
		    ch[i]=s.next().charAt(0);
		}
		for(int i=n-1;i>=0;i--)
		{
		    System.out.print(ch[i]);
		}
	}
}
