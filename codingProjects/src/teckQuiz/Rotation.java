package teckQuiz;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter the element of array : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        rotateRight(arr,size);
        System.out.println("\nArray after right rotation: ");
        for(int i = 0 ; i < size ; i++)
        {

            System.out.print(arr[i] + " ");
        }
    }
    public static void rotateRight(int arr[], int size)
    {
        int i, temp;

        temp = arr[size - 1];
        for (i = size-1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = temp;

    }

}
