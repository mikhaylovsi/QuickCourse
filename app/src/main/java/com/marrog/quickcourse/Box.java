package com.marrog.quickcourse;

import android.util.Log;

import java.sql.SQLOutput;

/**
 * Created by Сергей on 17.04.2016.
 */
public class Box {

    int width = 10;
    int height = 10;
    int depth = 10;

    Box(int i){
        System.out.println("Hey men!!!");
    }

    public int getVolume(){
        return width * height * depth;
    }

}

 class HeavyBox extends Box {

     int width = 20;
     int height = 20;
     int depth = 20;

  HeavyBox(int i){
      super(i);
      System.out.println(super.width);
      System.out.println(super.depth);
      System.out.println(super.height);
      System.out.println(i);
  }


}
