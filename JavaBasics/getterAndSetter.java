class Person{
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age > 18)
        this.age=age;
        else
        System.out.println("invalid");
    }
}

public class getterAndSetter {
    public static void main(String[] args){
        Person per = new Person();
        per.setFirstName("Naveen");
        System.out.println(per.getFirstName());
        per.setLastName("Seb");
        System.out.println(per.getLastName());
        per.setAge(12);
        System.out.println(per.getAge());

        
    }
}
