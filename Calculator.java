import java.util.Scanner;
public class Calculator
{
    Scanner sc=new Scanner(System.in);
    short n1,n2;
    public void input()
    {
        n1=sc.nextShort();
	    n2=sc.nextShort();
    }
    int addNumbers()
    {
        input();       
        return n1+n2;
    }
     int subNumbers()
    {
           input();       
         return n1-n2;
    }
     int mulNumbers()
    {
          input();       
         return n1*n2;
    }
    float divNumbers()
    {
          input();       
         return n1/n2;
    }
	public static void main(String[] args) {
	    Calculator m=new Calculator();
		System.out.println("The sum of two numbers is "+m.addNumbers());
		System.out.println("The answer after subtraction of two numbers is "+m.subNumbers());
		System.out.println("The multiplication of two numbers is "+m.mulNumbers());
		System.out.println("The division of two numbers is "+m.divNumbers());
	}
}
