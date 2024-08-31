


public class TypeCasting {
    public static void main(String[] args) {
        
        int intvalue = 100;
        //implicit type casting

        long longvalue = intvalue;
        double doublevalue = longvalue;

        System.out.println(intvalue);
        System.out.println(longvalue);
        System.out.println(doublevalue);
        

        //explicit type casting
        double doubleval = 200.56;
        long longval = (long)doubleval;
        int intval = (int)longval;
        byte byteval = (byte)doubleval;

        System.out.println(doubleval);
        System.out.println(longval);
        System.out.println(intval);
        System.out.println(byteval);
    }
}
