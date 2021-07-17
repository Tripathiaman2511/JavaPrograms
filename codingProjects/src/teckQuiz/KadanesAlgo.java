package teckQuiz;

import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int array1[]=new int[n];
        System.out.println("element of array: ");
        for(int i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("total sum of sub-array is: "+maxSumSybArray(array1,n));;
    }

    private static int maxSumSybArray(int[] array1, int n) {
            int maxSum=0;
            int curSum=0;
        for(int i=0;i<n;i++){
            curSum=curSum+array1[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }

        }return maxSum;
    }
}
