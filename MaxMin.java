//Minimum and Maximum element in an array in Java

public class MaxMin
{
   public static void main(String args[])
   {
       int arr[] = {34,15,19,25,12,78};
       int max = arr[0]; 
       int min = arr[0];
       for(int i=0; i<arr.length; i++) { 
           if(min > arr[i])
              min = arr[i];
           if(max < arr[i])
              max = arr[i];
       }
       System.out.println("minimum element in array is " + min);
       System.out.println("maximum element in array is " + max);
   }
}

//Time Complexity is O(n)
//Space Complexity is O(1)
