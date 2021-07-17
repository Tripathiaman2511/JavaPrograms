package teckQuiz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int noOfTower = sc.nextInt();
        int array[] = new int[noOfTower];

        System.out.println("enter the element of array : ");
        for (int i = 0; i < noOfTower; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the modifying key: ");
        int k=sc.nextInt();
        modifiedtower(array,k,noOfTower);
        System.out.println("modified height of given towers:  ");
        for(int i=0;i<noOfTower;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }

    private static void modifiedtower(int[] array, int k, int noOfTower) {
        for(int i=0;i<noOfTower;i++){
            if(array[i]>=k){
                array[i]-=k;
            }
            else{
                array[i]+=k;
            }


        }
    }

}
