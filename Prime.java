import java.util.Scanner;
public class Prime
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	int n2=s.nextInt();
	for(int i=n1;i<=n2;i++)
	{
	   int flag=0;
	   for(int j=2;j<i;j++)
	   {
	       if(i%j==0)
	       {
	           flag++;
	           break;
	       }
	   }
	   if(flag==0)
	   System.out.println(i);
	}
	}
}
