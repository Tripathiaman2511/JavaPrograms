package CodingPractise;
import java.util.Scanner;
public class KthElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size =input.nextInt();
        int[] arr= new int[size];

        System.out.println("enter the element: ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("enter the key: ");
        int key=input.nextInt();
        MaxElement(arr,size,key);
        MinElement(arr,size,key);
    }
    //to get max element from the array
    //ps: array is been sorted in descending order
    static void MaxElement(int[] arr, int size, int key) {
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            //check the ith position is equal to key-1 position
            if(i==key-1){
                System.out.println("from the sorted array, the "+key+" Max element is: "+arr[i]);
            }
        }
        System.out.println("sorted array is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

    }
    //to get max element from the array
    //ps: array is been sorted in ascending order
    static void MinElement(int[] arr, int size, int key) {
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            //check the ith position is equal to key-1 position
            if(i==key-1){
                System.out.println("From the sorted array, the "+key+" Min element is: "+arr[i]);

            }
        }
        System.out.println("sorted array is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

    }
}
