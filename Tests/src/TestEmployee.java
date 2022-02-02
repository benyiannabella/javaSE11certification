class Employee {
    String name;
    int age;

    Employee() {
        this("Michael", 22); //Line n1
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.name + ":" + emp.age); //Line n2
    }
}
