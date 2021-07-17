package teckQuiz;

import java.util.Scanner;

public class MaxSubArray {
    public static int kadane(int[] arr)
    {
        int maxSoFar = 0;
        int maxEndingHere = 0;

        for (int i: arr)
        {
            maxEndingHere = maxEndingHere + i;
            maxEndingHere = Integer.max(maxEndingHere, 0);
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter the element of array : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("The sum of contiguous subarray with the " +
                "largest sum is " + kadane(arr));
    }
}
