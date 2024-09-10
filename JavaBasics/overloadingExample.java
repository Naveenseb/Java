 
class Calculation{
    
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int addition(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static float addition(float num1, float num2){
        return num1 +num2;
    }
    public static float addition(int num1, float num2){
        return num1+num2;
    }
    public static float addition(float num1 , int num2){
        return num1+num2;
    }

}
public class overloadingExample {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        System.out.println(cal.addition(12,3));
        System.out.println(cal.addition(12,3,5));
        System.out.println(cal.addition(12.8f,35.5f));
        System.out.println(cal.addition(12,3.5f));
        System.out.println(cal.addition(12.8f,3));
    }
}
