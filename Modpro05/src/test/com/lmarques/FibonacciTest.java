package test.com.lmarques;

import org.junit.Test;

import main.com.lmarques.Fibonacci;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFindElement_HappyPath(){
        //System.out.println(Fib.findElement(5));
        int result = Fibonacci.findElement(7);
        assertEquals(result, 13);
    }
}