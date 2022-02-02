package optionals;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {

    private static final HashMap<String, String>  PHONE_NUMBERS= new HashMap<String, String>();

    PhoneBook(){
        phoneBookEntries.put("Jos de Vos", "016/161616");
        phoneBookEntries.put("An de Toekan", "016/161617");
        phoneBookEntries.put("Kris de Vis", "016/161618");
    }
    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    public HashMap<String, String> getPhoneBookEntries() {
        return phoneBookEntries;
    }

    public Optional<String> findPhoneNumberByName(String name){
        PhoneBook p = new PhoneBook();
        String s = p.phoneBookEntries.get(name);
        return (s == null) ? Optional.empty() : Optional.of(s);

    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber){
        PhoneBook p = new PhoneBook();
        String s =p.phoneBookEntries.entrySet()
                .stream()
                .filter(x->Objects.equals(x.getValue(), phoneNumber))
                .map(Map.Entry :: getKey)
                .collect(Collectors.joining(""));

        return (s == null) ? Optional.empty() : Optional.of(s);
    }


    @Override
    public String toString() {
        System.out.println("Hello from PhoneBook's toString method");
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries +
                '}';
    }

    public static void main(String[] args) {
        PhoneBook p = new PhoneBook();
        p.findPhoneNumberByName("Jos de Vos");
        p.findNameByPhoneNumber("016/161616");
    }
}