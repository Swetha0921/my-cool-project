import java.util.Scanner;
public class AlphaCase
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    char ch=s.next().charAt(0);
    if(ch>='A' && ch<='Z')
    System.out.println((char)(ch+32));
    else if(ch>='a' && ch<='z')
    System.out.println((char)(ch-32));
	}
}
