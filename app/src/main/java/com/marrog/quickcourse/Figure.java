package com.marrog.quickcourse;

/**
 * Created by Сергей on 24.04.2016.
 */
abstract public class Figure {

    double a;
    double b;

    Figure(double a, double b){

        this.a = a;
        this.b = b;

    };

    abstract double area();
}

 class Square extends Figure {

     Square(){

         super(2, 4);

     }

     @Override
     double area() {
         return a * b;
     }

 }
