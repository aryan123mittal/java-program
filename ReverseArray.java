//Reverse of an array in Java

public class ReverseArray
{
   public static void main(String args[])
   {
     int arr[] = {1,2,3,4,5};
     int n=arr.length;
     for(int i=n-1; i>=0; i--)
       System.out.print(arr[i]+" "); 
    }
}

//Time Complexity is O(n)
//Space Complexity is O(1)
