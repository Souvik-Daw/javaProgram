import java.util.*;
class condition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int a=sc.nextInt();//1
        if(a==1)
        {
            System.out.println("sun");
        }
        else if(a==2)
        {
            System.out.println("Mon");
        }
        else if(a==3)
        {
            System.out.println("tues");
        }
        else 
        {
            System.out.println("Not Zero");
        }
        switch(a)//1000
        {
            case 1:
            {
                System.out.println("Mon");
            }
            break;
            case 2:
            {
                System.out.println("tues");
            }
            break;
            case 3:
            {
                System.out.println("sun");
            }
            break;
            default:
            {
                System.out.println("Wrong choice");
            }
        }
    }
}
