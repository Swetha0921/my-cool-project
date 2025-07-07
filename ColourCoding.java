import java.util.Scanner;
public class ColourCoding
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char ch=s.next().charAt(0);
	String colour=(ch=='R')?"Red":(ch=='B')?"Blue":(ch=='O')?"Orange":(ch=='Y')?"Yellow":
                      (ch=='W')?"White":"Invalid Code";
    System.out.println(colour);
	}
}
