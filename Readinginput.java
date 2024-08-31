
import java.util.Scanner;


public class Readinginput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.print("Age:");
        int age =scanner.nextInt();
        System.out.print("Enter your Gender(Male/Female):");
        char gender =scanner.next().charAt(0);
        System.out.print("Enter your Contact Number:");
        long contact = scanner.nextLong();

        System.out.println("User Details" );
        System.out.println("Name:" +name);
        System.out.println("age:" +age);
        System.out.println("Gender:" +gender);
        System.out.println("Contact Number:" +contact);

    }
}
