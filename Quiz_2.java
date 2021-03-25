import java.util.*;
public class Quiz_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for computer related questions");
        System.out.println("Enter 2 for maths related questions");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            {
                int score=0;
                System.out.println("What is the full form of html???");
                System.out.println("1.Hyper text markup language");
                System.out.println("2.Hypersuper text makeup language");
                System.out.println("3.Hyper test markup lang");
                System.out.print("Enter the correct answer no-");
                int answer_1=sc.nextInt();
                if(answer_1==1)
                {
                    score=score+1;
                    System.out.println("Correct answer :)");
                }
                else
                {
                    System.out.println("Wrong answer :(");
                }
                System.out.println("Your total score is -> "+score);
            }
            break;
            case 2:
            {
                int score=0;
                System.out.println("What is the answer of 2*50???");
                System.out.println("1.56");
                System.out.println("2.89");
                System.out.println("3.100");
                System.out.print("Enter the correct answer no-");
                int answer_2=sc.nextInt();
                if(answer_2==3)
                {
                    score=score+1;
                    System.out.println("Correct answer :)");
                }
                else
                {
                    System.out.println("Wrong answer :(");
                }
                System.out.println("Your score is -> "+ score);
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
