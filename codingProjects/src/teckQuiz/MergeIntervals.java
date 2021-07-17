package teckQuiz;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;
class Interval{
    //arr=[[start1,end1],[start2,end2],...]
    int start,end;
    Interval(int start,int end){
        this.start=start;
        this.end=end;
    }
}
public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of interval: ");
        int size=sc.nextInt();
        Interval arr[]=new Interval[size];
        int m,n;
        System.out.println("enter the element of interval in-  start end form: ");
        for(int i=0;i<size;i++){
            m=sc.nextInt();
            n=sc.nextInt();
            arr[i]=new Interval(m,n);
        }
        Merge(arr);
        
    }

    private static void Merge(Interval[] arr) {
        if(arr.length<=0)
            return;
        Stack<Interval> stack=new Stack<>();
        Arrays.sort(arr,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start-i2.start;
            }
        });
        stack.push(arr[0]);
        for (int i = 1 ; i < arr.length; i++){
            Interval top = stack.peek();
            if (top.end < arr[i].start)
                stack.push(arr[i]);
            else if (top.end < arr[i].end)
            {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }
        Stack<Interval> tempStack=new Stack<>();
        while(stack.size()>0){
            tempStack.push(stack.pop());

        }

        System.out.print("The Merged Intervals are: ");
        while (tempStack.size()>0)
        {
            Interval t = tempStack.pop();
            System.out.print("["+t.start+","+t.end+"] ");
        }
    }
}
