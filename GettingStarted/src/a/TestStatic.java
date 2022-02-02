package a;

import a.d.StaticImportTest1;
import  static a.d.StaticImportTest1.APP_NAME;
import a.e.StaticImportTest2;
//import static a.e.StaticImportTest2.APP_NAME;
import static a.e.StaticImportTest2.log;

public class TestStatic {
    public static void main(String[] args) {

        System.out.println("APP_NAME 1 = " + APP_NAME);
        log("This is StaticImportTets1");

        new StaticImportTest1().printUniqueStatement();

        System.out.println("APP_NAME 2 = " + StaticImportTest2.APP_NAME);


        log("This is StaticImportTest2");

        new StaticImportTest2().printUniqueStatement();

    }

}
