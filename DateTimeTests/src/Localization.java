import java.text.NumberFormat;
import java.util.Locale;

public class Localization {
    public static void main(String[] args) {
        Locale l = Locale.getDefault();
        System.out.println(l);

        Locale l2 = new Locale.Builder()
                .setLanguage("hu")
                .setRegion("HU")
                .build();
        Locale.setDefault(l2);

        NumberFormat n = NumberFormat.getCurrencyInstance(l2);
        System.out.println(l2);
        int num = 10;
        System.out.println(n.format(num));

    }
}
