package org.pkg.appglobals;

public class ApplicationConstants {

    public static final String APP_NAME = "Module Testing";
    private static int counter;

    public static void addCounter(){
        counter+=1;
    }

    public static int getCounter() {
        return counter;
    }
}
