public class SwitchClass {

    public static void main(String[] args) {

    String[] strs = {"A", "B", "C", "D"};
    int iteration = 0;

    for(String s : strs){
        System.out.println("__________iteration" + (++iteration) + ", s = " + s + "________________");

        switch (s){
            case "A":
                System.out.println("DO A");
            default:
                System.out.println("DO THIS");
            case "B":
                System.out.println("DO B");
            case "C":
                System.out.println("DO C");
//            case "D":
//                System.out.println("DO D");
        }
    }

    }
}
