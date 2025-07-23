import java.util.Scanner;
public class CountLetterSpace
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int letter=0,space=0;
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++)
		{
		    if(a.charAt(i)!=' ')
		    {
		        letter++;
		    }
		    else
		    {
		      space++;  
		    }
		}
		System.out.println("letter = "+letter+" space = "+space);
		
	}
}
