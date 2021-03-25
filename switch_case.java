import java.util.*;
public class switch_case
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bt 1 to 3");
        int a=sc.nextInt();
        switch(a)//4
        {
            case 1:
            {
                System.out.println("One");
            }
            break;
            case 2:
            {
                System.out.println("two");
            }
            break;
            case 3:
            {
                System.out.println("three");
            }
            break;
            default:
            {
                System.out.println("Wrong choice");
            }
            break;
        }
    }
}
