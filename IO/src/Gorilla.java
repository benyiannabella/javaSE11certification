import java.io.Serializable;

public class Gorilla implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient int age;
    private static String name;
    private String food;

    public Gorilla(int age, String name, String food) {
        this.age = age;
        this.name = name;
        this.food = food;
    }

    @Override
    public String toString() {
        return "Gorilla{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
