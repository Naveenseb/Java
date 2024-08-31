public class TernaryOperator {
    public static void main(String[] args) {
        boolean IsAuthenticated = true;

        if(IsAuthenticated)
        System.out.println("You are logged in sucessfully. ");
        else
        System.out.println("Ypu are not logged in. ");

        String result = (IsAuthenticated) ? "logged in" : "Logged Out";
        System.out.println(result);

    }
}
