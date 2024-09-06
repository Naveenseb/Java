import java.util.Scanner;

class Students{
    int stdID;
    String StdName;
    int RollNo;
    Scanner scanner = new Scanner(System.in);

  public void acceptingdetails(){
    System.out.print("Enter the Student ID : ");
    stdID = scanner.nextInt();
    System.out.print("Enter the Student Name : ");
    StdName = scanner.next();
    System.out.print("Enter the Student Roll No. : ");
    RollNo = scanner.nextInt();


}
public void displaydetails(){
    System.out.println("STUDENT ID : " +stdID);
    System.out.println("STUDENT NAME : " +StdName);
    System.out.println("STUDENT ROLL NO. : " +RollNo);
}  

}

public class classAndObjectExample {
    public static void main(String[] args) {
        Students students = new Students();
        students.acceptingdetails();
        students.displaydetails();
    }
}
