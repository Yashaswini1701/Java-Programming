import java.util.*;
public class loginSystem{
    public static void main(String[] args){
        String Username = "Yashaswini";
        String Password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password:");
        String a = sc.nextLine();
        System.out.println("Enter the username:");
        String b = sc.nextLine();
        if(a.equals(Password) && b.equals(Username)){
            System.out.println("Succesfully logged In");
        } else {
            System.out.println("Invalid password or username");
        }
    }
}