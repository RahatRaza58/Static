package oop;

public class Counter {
    static int count=0;
    static int speed;
    static String brand;

    Counter()
    {
        count++;
        System.out.println("\nPostion: "+count);
        System.out.println("Speed Per Hour: "+speed);
        System.out.println("Brand Model: "+brand);
    }

}
