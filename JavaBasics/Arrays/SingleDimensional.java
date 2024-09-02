public class SingleDimensional {
    public static void main(String[] args) {
        //initialize an array
        int[] mark = new int[] {100,55,77,65,89};

        //declare and assign
        int[] marks = new int[5];
        marks[0]= 10;
        marks[1]= 16;
        marks[2]= 23;
        marks[3]= 99;
        marks[4]= 66;

        //traditional for loop
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("*******************");
        //for each loop

        for(int value : mark){
            System.out.println(value);
        }


    }
}
