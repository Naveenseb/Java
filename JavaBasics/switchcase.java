
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Admin - Gets full access");
        System.out.println("Subadmin - Gets course delete/create access");
        System.out.println("Pretest - Gets test access");
        System.out.println("User - Get access to consume content");
        System.out.print("enter your choice : ");
        String user = scanner.nextLine();


        switch(user){
            case "Admin" :
            System.out.println("Gets Full Access");
            break;
            case "Subadmin":
            System.out.println("Gets Course delete/create access");
            break;
            case "Pretest":
            System.out.println("Gets Test Access");
            break;
            case "User":
            System.out.println("Access to consume Content");
            break;
            default:
            System.out.println("You are a trail User");
            break;

        }
    }
}
