package test.com.java10practice;

import org.junit.Test;

import java.util.List;

public class ImmutableListInJava9 {
    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedOperation(){
        List l =List.of();
        l.add(10);
    }
}
