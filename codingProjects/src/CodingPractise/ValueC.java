package CodingPractise;

public class ValueC {
    public static void main(String[] args) {
       int n,rev,rem,orig;
       n=63206;
       rev=0;
       orig=n;
       while(n!=0){
           rem=n%10;
           rev=rev*10+rem;
           n=n/10;

       }
       if(orig==rev){
           System.out.println("a"+rev);
       }else{
           System.out.println("b"+(orig-rev)/6);
       }

    }
}
