import java.util.Scanner;
public class Interest
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    String gender=s.next();
    int age=s.nextInt();
    if(gender.equals("Female")){
    if(age >= 1 && age <= 58)
    System.out.println("The percentage of interest is 8.2%");
    else
    System.out.println("The percentage of interest is 9.2%");
    }
    if(gender.equals("Male")){
    if(age >= 1 && age <= 58)
    System.out.println("The percentage of interest is 8.4%");
    else
    System.out.println("The percentage of interest is 10.5%");
    }
	}
}
