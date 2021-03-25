import java.util.*;
public class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        int r=sc.nextInt();
        double area=3.14*r*r;
        double cir=2*3.14*r;
        System.out.println("area "+area);
        System.out.println("circ "+cir); 
    }
}
