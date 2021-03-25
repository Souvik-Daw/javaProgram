package InterviewQuestions;

public class test5 {
	public static void main(String args[])
	{
		String s="660682";
		int n=s.length();
		int m=0;
		for(int i=0;i<=n-3;i++)
		{
			String p=s.substring(i,i+3);
			m=Math.max(Integer.parseInt(p),m);	
		}
		System.out.println(m);
	}
}
