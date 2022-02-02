import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        HashMap<String, String> zoo = new HashMap<>();
        zoo.put("panda" , "bamboo");
        System.out.println(zoo);
        System.out.println(zoo.size());
        System.out.println(zoo.get("panda"));
        System.out.println(zoo.getOrDefault("hawk", "rat"));
        System.out.println(zoo.isEmpty());
        zoo.put("bear", "berries");
        System.out.println(zoo);


        zoo.put("panda", "grass");
        zoo.put("cow", "grass");


        zoo.remove("cow");
        for(String s : zoo.keySet()){
            System.out.println("Zoo animal " + s  + ", eats " + zoo.get(s));
        }
        System.out.println(zoo.keySet());
        System.out.println(zoo.values());
    }
}
