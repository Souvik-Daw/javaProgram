package InterviewQuestions;

public class findDublicate {
	public static void main(String args[]) {
		int arr[] = {1,3,3};
		int n=arr.length;
		System.out.println("Dublicate element is = "+find(arr,n));
	}

	static int find(int[] arr, int n) {
		if(n<=1)
			return -1;
		int slow=arr[0];
		int fast=arr[arr[0]];
		while(fast!=slow)
		{
			slow=arr[slow];
			fast=arr[arr[fast]];
		}
		slow=0;
		while(fast!=slow)
		{
			slow=arr[slow];
			fast=arr[fast];
		}
		return slow;
	}
}
