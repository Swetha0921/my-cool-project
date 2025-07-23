import java.util.Arrays;
import java.util.Scanner;
class ValidAnagram{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        char [] ar=a.toCharArray();
        char [] br=b.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(br);
        if(Arrays.equals(ar,br)){
            System.out.println("yes. It is a valid anagram");
        }
        else{
            System.out.println("No. It is  not a valid anagram");
        }
    }
}
