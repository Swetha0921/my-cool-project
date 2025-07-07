import java.util.Scanner;
public class SumOfDigits
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	int n,sum=0;
	while(n1>0)
	{
	    n=n1%10;
	    sum+=n;
	    n1/=10;
	}
	System.out.println(sum);
	}
}
