package teckQuiz;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
    //num
    //n+1 element
    //range=1 to n
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("duplicate number is: "+duplicateFinder(nums,n));;

    }

    private static int duplicateFinder(int[] nums, int n) {
        Arrays.sort(nums); //sort
        for(int i=0;i<n;i++){
            int key=nums[i]; //mark first value as a key
            for(int j=i+1;j<n;j++){
                if(nums[j]==key){ //check for i+1 value is equal to key or not
                   return nums[j]; // if yes return the value which appeared more than once
                }
            }
        }
        return -1; // if not then return null value
    }

}
