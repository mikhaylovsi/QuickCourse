package com.marrog.quickcourse;

/**
 * Created by Сергей on 24.04.2016.
 */
public interface SimpleInterface {

    String getClassName();
    int getAge();

}

class simpleInterfaceImplementation implements SimpleInterface{


    @Override
    public String getClassName() {
        return "simpleInterfaceImplementation";
    }

    @Override
    public int getAge() {
        return 40;
    }



}
