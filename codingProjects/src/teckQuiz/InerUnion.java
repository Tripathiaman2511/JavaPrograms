package teckQuiz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class InerUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        Integer arr1[]=new Integer[size];
        Integer arr2[]= new Integer[size];
        System.out.println("enter the element of array 1: ");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the element of array 2: ");
        for(int i=0;i<size;i++){
            arr2[i]=sc.nextInt();
        }

        unioN(size,arr1,arr2);
        interSection(size,arr1,arr2);

    }

    private static void unioN(int size, Integer[] arr1, Integer[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));

        Integer[] Uni={};
        Uni=set.toArray(Uni);
        System.out.println("uinon of 2 arrays: ");
        System.out.println(Arrays.toString(Uni));

    }

    private static void interSection(int size, Integer[] arr1, Integer[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(arr1));
        set.retainAll(Arrays.asList(arr2));

        Integer[] interSection={};
        interSection=set.toArray(interSection);
        System.out.println("intersection of 2 arrays: ");
        System.out.println(Arrays.toString(interSection));
    }
}
