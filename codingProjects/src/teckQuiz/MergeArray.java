package teckQuiz;

import java.util.Arrays;
import java.util.Scanner;
public class MergeArray {
    //arr1={1,3,5,7}
    //arr2={0,2,6,8,9}
    //output
        //arr1={0,1,2,3}
        //arr2={5,6,7,8,9}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int m=sc.nextInt();
        System.out.println("Enter the size of array 2: ");
        int n=sc.nextInt();
        int arr1[]=new int[m];
        int arr2[]=new int[n];
        System.out.println("Enter the elements of array 1: ");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of array 2: ");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        //check whether the arrays are sorted or not

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        Merge(arr1,arr2,m,n);
    }

    private static void Merge(int[] arr1, int[] arr2, int m, int n) {
        for(int i=0;i<m;i++) //select index of array 1
        {
            for(int j=0;j<n;j++) // select index of array 2
            {
                if(arr1[i]>=arr2[j]) //compare the indexes
                {
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                    Arrays.sort(arr2); // after swapping sort array 2
                }
            }

        }
        System.out.println("Array 1 elements:  ");
        for(int i=0;i<m;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Array 2 elements:  ");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
}
