import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
//        getTotalNumberOfLettersOfNamesLongerThanFive("hello", "goodbye", "haliho");
        List<List<String>> collection = Arrays.asList(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third"));
        transform(collection);

    }

    //Now, starting again from a list of names, give me the total number
    // of letters in all the names with more than 5 letters
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
       int i = Arrays.stream(names)
                .filter(x->x.length() > 5)
                .mapToInt(x->x.length()).sum();
        System.out.println(i);
       return i;
    }

    //Flatten this multidimensional collection
    public static List<String> transform(List<List<String>> collection) {
        List<String> s =  collection.stream()
                .flatMap(x->x.stream())
                .collect(Collectors.toList());
        System.out.println(s);
        return s;
    }

//Get the oldest person from the collection
    public static Person getOldestPerson(List<Person> people) {
        return people.stream()
                .max((a,b)->a.getAge() - b.getAge()).get();

    }

    //Sum all elements of a collection,
    // try to use the reduce operator with identity parameter instead of an IntStream
    public static int calculate(List<Integer> numbers) {
//        int i =numbers.stream()
//                .mapToInt(x->x)
//                .sum();
//        System.out.println(i);
//        return i;

        int i =numbers.stream()
                .reduce(0, (a,b)->a+b);
        System.out.println(i);
        return i;
    }
}
