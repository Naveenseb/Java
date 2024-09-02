public class MultiDimensionalArray {
    public static void main(String[] args) {
        
        int marks[][] = {

            {12,23,56,76,54},
            {34,76,43,26,86},
            {58,31,62,63,19}};

            for(int i=0;i<3;i++){
                for(int j=0;j<5;j++){
                    System.out.print(marks[i][j] +"\t");
                }
                System.out.println();
            }
    }
}
