import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
public @interface Swimmer {
    int age = 20;
    String name();
    String favoriteStyle();
    String rank() default "2nd place";
}

class Athlete{

    @Swimmer(name = "Phelps", favoriteStyle = "freestyle")
    public void getDetails(){
        System.out.println("athlete is a swimmer");
    }

    public static void main(String[] args) {
        Athlete a = new Athlete();
        a.getDetails();
    }
}
