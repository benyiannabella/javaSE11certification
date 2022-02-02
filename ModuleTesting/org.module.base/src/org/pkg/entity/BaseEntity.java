package org.pkg.entity;

import org.pkg.appglobals.ApplicationConstants;
import org.pkg.util.Countable;

public class BaseEntity implements Countable {

    public BaseEntity(){
        countMe();
    }
    @Override
    public void countMe() {
        ApplicationConstants.addCounter();
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            BaseEntity b1 =  new BaseEntity();
        }
        System.out.println(ApplicationConstants.APP_NAME + " created "
                + ApplicationConstants.getCounter() + " objects");
    }
}
