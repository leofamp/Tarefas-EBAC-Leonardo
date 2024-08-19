package main.com.lmarques;

public class Fibonacci {

    public static int findElement(int elementNumber){
        if(elementNumber <= 1){
            return elementNumber;
        }
        return findElement(elementNumber - 1) + findElement(elementNumber - 2);
    }
}