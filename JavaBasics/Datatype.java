

import java.awt.Point;
import java.time.LocalDateTime;

public class Datatype {
    /**
     * @param args
     */
    public static void main(String[] args) {
        byte age = 23;
        long viewcount = 12345664;
        float price = 23.45F;
        char gender = 'M';
        boolean isvalid = true;
        System.out.println(age);
        System.out.println(viewcount);
        System.out.println(price);
        System.out.println(gender);
        System.out.println(isvalid);

        //non-primitive
        String name = "King";
        System.out.println(name);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        Point point1 = new Point(10, 20); 
        Point point2 = point1;
        System.out.println(point1.x + ":" + point1.y);
        System.out.println(point2.x + ":" + point2.y);
        point1.y=88;
        System.out.println(point1.x + ":" + point1.y);
        System.out.println(point2.x + ":" + point2.y);

        

    }
}
