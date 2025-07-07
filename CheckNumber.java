import java.util.Scanner;
public class CheckNumber
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	if(n1>0)
	System.out.println("Positive Number");
	else if(n1<0)
	System.out.println("Negative Number");
	else
	System.out.println("Zero");
	}
}
