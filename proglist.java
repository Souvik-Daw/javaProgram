import java.util.*;
public class proglist {
	public static void main(String args[])
	{
       List<Integer> v=new ArrayList<>();
       v.add(501);
       v.add(602);
       v.add(905);
       v.add(104);
       List<Integer> v1=new ArrayList<>();
       v1.add(9);
       v1.add(78);
       Comparator<Integer> obj =new Comparator<Integer>()
    		   {
    	   public int compare(Integer i,Integer j)
    	   {
    		   return i%10>j%10?1:-1;
    	   }
    		   };
    		   Collections.sort(v,obj);
       for(Integer i:v)
       {
    	   System.out.println(i);
       }
    }
}
