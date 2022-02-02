import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;
import java.util.function.BiFunction;
import java.util.jar.JarOutputStream;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, String> animals = new HashMap<>();
        animals.put("panda", "bamboo");
        animals.put("koala", "eucalyptus");
        animals.put("lion", "meet");
//        System.out.println(animals.isEmpty());
//        System.out.println(animals.size());

        if (animals.containsValue("bamboo")) {
//            System.out.println("Panda eats bamboo");
        }

//        System.out.println(animals.entrySet());
//        System.out.println("Koala eats " + animals.get("koala"));
//        System.out.println(animals.getOrDefault("piton", "mouse"));
//        System.out.println(animals.put("piton", null));
//        System.out.println(animals.putIfAbsent("piton", "mouse"));
//        System.out.println(animals.remove("panda"));
//        System.out.println(animals.replace("piton", "rat"));
//        System.out.println(animals.entrySet());
//        System.out.println(animals.keySet());
//        System.out.println(animals.values());
        animals.replaceAll((k, v) -> "Food: " + v);
//        animals.entrySet().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
        animals.putIfAbsent("panda", "bamboo");
        animals.putIfAbsent("rabbit", null);
        animals.putIfAbsent("rabbit", "carrot");
//        System.out.println(animals.entrySet());

//        Map<String, String> newMap = Map.copyOf(animals);
//        System.out.println(newMap);

        Map<String, String> testMap = Map.ofEntries(
                Map.entry("George", "zookeeper"),
                Map.entry("Linda", "administrator")
        );
//        System.out.println(testMap);

        BiFunction<String, String, String> mapper =
                (v1, v2) -> v1.length()> v2.length() ? v1 : v2;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Sam", null);
        favorites.merge("Tom", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);
        System.out.println(favorites);

// {Tom=Skyride, Sam=Skyride}
    }

}
