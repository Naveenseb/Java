public class StringBufferAndBuilder {
    public static void main(String[] args) {
        
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println(buffer.capacity());
        buffer.append("World");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("Hello");
        System.out.println(builder.capacity());
        builder.append("World");
        System.out.println(builder);



    }
}
