
import java.util.*;
public class game1
{
    public static void main()
    {
    int count=0;
    int count1=0;
    int count2=0;//count the number of points
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter-");
    System.out.println("1 for technology related words");
    System.out.println("2 for math related words");
    System.out.println("3 for commerce related words");
    int i=sc.nextInt();
    
    
    switch(i)
    {
        case 1:
        {
    System.out.println("1.egolog");//google
    System.out.print("Enter the answer - ");
    String s=sc.nextLine();
    if(s.equalsIgnoreCase("google")==true)
    {
    System.out.println("Correct Answer");
    System.out.println("Points + 1");
    count++;
   }
   else
   {
       System.out.println("Wrong Answer");
   }
   System.out.println();
   System.out.println();
   
    System.out.println("2.aailmn");//animal
    System.out.print("Enter the answer - ");
    String s2=sc.nextLine();
    if(s2.equalsIgnoreCase("animal")==true)
    {
    System.out.println("Correct Answer");
    System.out.println("Points + 1");
    count++;
    }
   else
   {
       System.out.println("Wrong Answer");
   }
   System.out.println();
   System.out.println();
   
   
   System.out.println("3.sbieetw");//website
    System.out.print("Enter the answer - ");
    String s3=sc.nextLine();
    if(s3.equalsIgnoreCase("website")==true)
    {
    System.out.println("Correct Answer");
    System.out.println("Points + 1");
    count++;
   }
   else
   {
       System.out.println("Wrong Answer");
   }
   System.out.println();
   System.out.println();
   
   System.out.println("The game is over");
   System.out.println("Your Points - "+count);
  }
  break;
  
  
  case 2:
  {
    System.out.println("1.egraoiinttn");//integration
    System.out.print("Enter the answer - ");
    String p=sc.nextLine();
    if(p.equalsIgnoreCase("integration")==true)
    {
    System.out.println("Correct Answer");
    System.out.println("Points + 1");
    count2++;
   }
   else
   {
       System.out.println("Wrong Answer");
   }
   System.out.println();
   System.out.println();
   
    System.out.println("2.usm");//sum
    System.out.print("Enter the answer - ");
    String s5=sc.nextLine();
    if(s5.equalsIgnoreCase("sum")==true)
    {
    System.out.println("Correct Answer");
    System.out.println("Points + 1");
    count2++;
    }
   else
   {
       System.out.println("Wrong Answer");
   }
   System.out.println();
   System.out.println();
   
   
   System.out.println("3.oarti");//ratio
    System.out.print("Enter the answer - ");
    String s6=sc.nextLine();
    if(s6.equalsIgnoreCase("ratio")==true)
    {
    System.out.println("Correct Answer");
    System.out.println("Points + 1");
    count2++;
   }
   else
   {
       System.out.println("Wrong Answer");
   }
   System.out.println();
   System.out.println();
   
   System.out.println("The game is over");
   System.out.println("Your Points - "+count2);  
  }
  break;
  
}
}
}