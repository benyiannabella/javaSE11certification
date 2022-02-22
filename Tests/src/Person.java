public class Person {
    public String name = "I am instance variable";
    static{
        System.out.println("I am static");
    }
    {
        name = "initializer";
        System.out.println("I am instance");}

    public Person(){
        System.out.println("I am constructor");
//        name="constructor";
    }


    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
    }

}
