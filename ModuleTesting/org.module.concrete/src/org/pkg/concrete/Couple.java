package org.pkg.concrete;

import org.pkg.appglobals.ApplicationConstants;
import org.pkg.util.Countable;

public class Couple implements Countable {

    public Couple(){
        countMe();
    }


    @Override
    public void countMe() {
        ApplicationConstants.addCounter();
        ApplicationConstants.getCounter();
    }
}
