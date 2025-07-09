import java.util.Scanner;
class AreaCircle
{
    double circle(int radius)
    {
        double area=Math.PI*radius+radius;
        return area;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        AreaCircle m=new AreaCircle();
        int  a=s.nextInt();
        double result=m.circle(a);
        System.out.println(result);
    }
}
