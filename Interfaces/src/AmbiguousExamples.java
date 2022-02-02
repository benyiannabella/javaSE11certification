interface Confusable{

    String name = "Confusable";
    String confuse();
}

abstract class Confused implements Confusable{
    public static String name = "Confused";
    public abstract String confuse();
}
public class AmbiguousExamples extends Confused {

    public static void main(String[] args) {

        AmbiguousExamples a = new AmbiguousExamples();
        System.out.println("The method confuse returns: " + a.confuse());
    }
    @Override
    public String confuse() {
        return name;
    }
}
