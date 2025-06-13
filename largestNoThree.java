import java.util.*;
public class largestNoThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Largest Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c){

            System.out.println("The largest number:"+a);
        }
        else if(b>=a && b>=c){
            System.out.println("The largest number:"+b);
        }
        else{
            System.out.println("The largest number:"+c);
        }
   
    }
}