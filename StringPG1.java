import java.util.Scanner;
public class StringPG1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String vowel="aeiouAEIOU";
		String a=sc.nextLine();
		String [] arr=a.split(" ");
		for(String s:arr)
		{
		    char c=s.charAt(0);
		    if(vowel.indexOf(c)!=-1)
		    {
		        System.out.println(s);
		    }
		}
	}
}
