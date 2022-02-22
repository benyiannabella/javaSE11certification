import java.util.*;


public class Lists {
    enum TrafficLight{
        YELLOW,RED,GREEN
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("M", "R", "A", "P");
        Collections.sort(list, null);
        System.out.println(list);
    }

}

