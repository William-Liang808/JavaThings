package com.company;
import java.lang.Math;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Rolling...");
        long roll = Math.round(Math.random() * 6);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex){
            //do nothing
        }
        System.out.println("Your rolled: " + roll);
        }

}
