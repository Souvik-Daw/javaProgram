
import java.util.*;
class lineRev
{
    public static void main(String []args)
    {
        lineRev ob = new lineRev();
        while(true)
        {
            System.out.print("1> Pop The Numbers From A Line\n2> Reverse The Position Of The Words In A Line\n3> To Exit The Program\nEnter Your Choice :: ");
            switch(new Scanner(System.in).nextInt())
            {
                case 1:ob.numberPopper();System.out.println("\n");continue;
                case 2:ob.reverseLine();System.out.println("\n");continue;
                case 3:return;
                default:System.out.println("Please Type Properly.\n");continue;
            }
        }
    }

    private void numberPopper()
    {
        System.out.println("Pop The Numbers From A Line =>");
        System.out.print("Enter The Line :: ");
        Scanner sc = new Scanner(new Scanner(System.in).nextLine()).useDelimiter("[^0-9]+");
        while(sc.hasNextInt())
            System.out.println("Integer Found :: "+sc.nextInt());            
        System.out.println("No More--------------The End");
    }

    private void reverseLine()
    {
        System.out.println("Reverse The Position Of The Words In A Line =>");
        System.out.print("Enter A Line As Input :: ");        
        StringTokenizer st = new StringTokenizer(new Scanner(System.in).nextLine()," ");
        Deque<String> deque = new LinkedList<String>();

        while(st.hasMoreTokens())
            deque.addLast(st.nextToken());
        try {
            while(true)
                System.out.print(deque.removeLast()+" ");
        }
        catch(Exception e) {
            System.out.println();
            System.out.println("The End");
        }
    }

}