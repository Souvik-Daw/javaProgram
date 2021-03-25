import java.util.*;
public class Hash {
	public static void main(String args[])
	{
		/*List<String> a=new ArrayList<>();
		a.add("1jbj");//0
		a.add("2jbj");//1
		a.add("3kbj");//2
		a.remove(new String("1jbj"));
		for(String i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		List<Integer> a=new ArrayList<>();
		int n=sc.nextInt();
		System.out.println("Enter few no's");
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println(a.get(0));
		
		Set<Integer> s=new TreeSet<>();
		s.add(8);
		s.add(2);
		s.add(9);
		s.add(59);
		s.add(96);
		s.add(5);
		
		System.out.println(s);
		
		Map<Integer,String> m=new TreeMap<>();
		m.put(35,"Sayam");
		m.put(36, "Sayam");
		m.put(63,"Samit");
		m.put(69,"basu");
		m.put(69,"souvik");
		m.put(69,"basu");
		for(Map.Entry<Integer,String> e:m.entrySet())
		{
			System.out.println(e.getKey()+"    "+e.getValue());
		}
		*/
		Set<Integer> s=new TreeSet<>();
		s.add(8);
		s.add(2);
		s.add(9);
		s.add(59);
		s.add(96);
		s.add(5);
		System.out.println(s.contains(6));
		System.out.println(s);
	}
}
