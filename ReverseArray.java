public class ReverseArray
{
   public static void main(String args[])
   {

     int arr[] = {10, 20, 30, 40, 50};

     int n=arr.length;
     for(int i=n-1; i>=0; i--)
       System.out.println(arr[i]+" "); 
       System.out.println("Array length:"+n);
    }
}
