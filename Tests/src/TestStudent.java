class Student1 {
    String name;
    int age;

    void Student() {
        Student("James", 25); //Line n1
    }

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student1 s = new Student1(); //Line n2
        System.out.println(s.name + ":" + s.age); //Line n3
    }
}