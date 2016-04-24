package com.marrog.quickcourse;

/**
 * Created by Сергей on 24.04.2016.
 */
public interface ConstantsInterface {

    int AGE = 24;
    int WEIGHT = 70;
}

class SimpleMan implements ConstantsInterface{


    int manAge = AGE;
    int manWeight = WEIGHT;


    public void sayHello() {

    }

}
