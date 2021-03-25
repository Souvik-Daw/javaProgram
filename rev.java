/*
1 20
even - 
odd -   
*/import java.util.*;
public class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("start?");
        int start=sc.nextInt();
        System.out.println("end?");
        int end=sc.nextInt();
        if(start<end)
        {
            int i=start;
            while(i<=end)
            {
                if(i%2==0)
                {
                    System.out.println("even -> "+i);
                }
                else
                {
                    System.out.println("odd -> "+i);
                }
                i++;
            }
        }
        else
        {
            System.out.println("Wrong Input");
        }
    }
}
