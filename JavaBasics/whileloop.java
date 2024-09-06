
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        // int i=1;
        // while(i<10){
        //     System.out.println("Hello world " +i);
        //     i++;
        // }

        Scanner scanner = new Scanner(System.in);
        String Input = " ";
        while(!Input.equals("quit")){
            System.out.println("Enter the input : ");
            Input = scanner.nextLine().toLowerCase();
            System.out.println(Input);
        }

        
    }
}
