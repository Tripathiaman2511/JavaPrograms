package teckQuiz;

import java.util.Scanner;

public class jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("enter the element of array : ");
        for (int i = 0; i <size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Minimum jump will be:"+minJump(array,size));
    }

    static int minJump(int[] array,int size) {
        if(size<=1)
            return 0;

        if(array[0]==0)
            return -1;
        int maxReach = array[0];
        int step = array[0];
        int jump = 1;
            for (int i = 1; i < size; i++) {

                if (i == size - 1)
                    return jump;
                maxReach = Math.max(maxReach, i + array[i]);
                step--;
                if (step == 0) {
                    jump++;
                    if (i >= maxReach)
                        return -1;
                    step = maxReach - i;
                }
        }

        return -1;
    }
}
