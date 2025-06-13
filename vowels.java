import java.util.*;
public class vowels{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char a = sc.next().charAt(0);
    boolean is_vowel = false;;
    char[] vowels = {'a','e','i','o','u'};
    for (char v : vowels) {
        if (v == a){
            is_vowel = true;
        }
    }

    if ( is_vowel == true) {
        System.out.println("The given character is a Vowel");
    } else {
        System.out.println("The given character is not a Vowel");
    }
}
}