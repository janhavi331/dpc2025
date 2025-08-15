import java.util.Scanner;
public class sort
{
    public static void sort(int[] arr)
    {
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];      //function for performing sorting using swaping concept
                arr[mid]=temp;
                low++;
                mid++;
            } else if(arr[mid]==1) {

                mid++;
            }
            else {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of array:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the elements in array:");
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        sort(arr);
        System.out.println("sorted array is:");
        for (int num:arr){
            System.out.print(num+" ");
        }
        
    }
}
