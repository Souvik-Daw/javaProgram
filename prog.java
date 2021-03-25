
public class prog
{
    public static void main()
    {
        prog obj=new prog();
        int arr[]={1,2,4,3,6,7};//main array
        int arr1[]=new int[5]; 
        int n=2;//check 2 values at a time
        int start=0;
        int end=0;
        int r=0;
        int max=0;
        int fend=0;
        for(int i=0+start;i<=n+end;i++)
        {
            start++;
            end++;
            fend=n+end;
            if(fend==arr.length)
            {
            if(arr[i]>max)
            {
                max=arr[i];
                arr1[r]=max;
                r++;
                max=0;
            }
          }
        }
        for(int i=0;i<5;i++)
        System.out.println(arr1[i]);
    }
}