import java.util.Scanner;
public class user_input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inteer = sc.nextInt();
        System.out.println(inteer);

        sc.close();
    }
}