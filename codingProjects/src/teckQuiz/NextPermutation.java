package teckQuiz;

import java.util.*;
//Important this program will only work for distinct elements
public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int m=sc.nextInt();
        int arr[]=new int[m];
        System.out.println("enter the element of array: ");
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }

        Next(arr);
    }

    public static void Next(int[] arr)
    {
        //point at second last element from the array
        int k=arr.length-2;
        while(k>=0 && arr[k]> arr[k+1])//compare kth element and (k+1)th element
        {
            --k;
        }
        if(k==-1)//this point would be the last sequence
        {
            reverse(arr,0,arr.length-1); //reverse completely
            return;
        }
        //we will traverse through each element in the array from end point till the kth element
        for(int l=arr.length-1;l>k;--l)
        {
            //if somehow we found that the kth element is less then the (k+1)th element then we will just swap them
            if(arr[l]>arr[k])
            {
                int temp=arr[k];
                arr[k]=arr[l];
                arr[l]=temp;
                break;
            }
        }
        // we reverse the suffix element in increasing order to get the next sequence
        reverse(arr,k+1,arr.length-1);
        System.out.println("Next Permutation will be: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    public static void reverse(int[] arr,int start,int end){

        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
}
