@FunctionalInterface
interface LearnToSpeak {
    void speak(String sound);
}

class DuckHelper{
    public static void teacher(String name, LearnToSpeak trainer){
        trainer.speak(name);
    }
}


public class Duckling {
    public static void makeSound(String sound){
//        LearnToSpeak learner = s -> System.out.println(s);
        LearnToSpeak learner = System.out :: println;
        DuckHelper.teacher(sound, learner);
    }
}
