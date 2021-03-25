package packTest;
public class LowerBound {
    public static int lowerBound(int[] array, int length, int value) {
        int low = 0;
        int high = length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            //checks if the value is less than middle element of the array
            if (value <= array[mid])//10<=7
            	{
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    /*
     */
    public static void main(String args[])
    {
    	int arr[]= {1,2,4,6,9,11,12,17,18};
    	int n=arr.length;
    	int v=1;
    	int p=lowerBound(arr,n,v);
    	//int p1=upperBound(arr,n,v);
    	System.out.println(arr[p-1]);
    	//System.out.println(arr[p1]);
    }
}
