import java.lang.annotation.Repeatable;

public class Animal {

    @Health("bye")
    @Health(value ="hi", level = 2)
    private Sloth sloth;

    @SafeVarargs
    public Animal(String ...safe) {
    }

    class Sloth extends Animal {
    }

}

@Repeatable(value = Healths.class)
@interface Health {
    int level() default 1;
    String value();

    String mood() default "sloppy";
}

@interface Healths {
    Health[] value();
}
