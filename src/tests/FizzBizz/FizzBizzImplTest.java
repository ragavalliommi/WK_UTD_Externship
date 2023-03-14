package tests.FizzBizz;

import main.FizzBuzz.FizzBizzImpl;
import org.junit.jupiter.api.Test;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBizzImplTest {

    @Test
    void validRangeFizzBuzz(){
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final BufferedOutputStream bos = new BufferedOutputStream(baos);

        System.setOut(new PrintStream(bos));
        var obj = new FizzBizzImpl();
        obj.fizzBizzImplementation(1, 15);
        System.out.flush();

        String s = "1\n2\n3 Fizz\n4\n5 Buzz\n6 Fizz\n7\n8\n9 Fizz\n10 Buzz\n11\n12 Fizz\n13\n14\n15 Buzz\n";
        String platformDependentExpectedResult = s.replaceAll("\\n", System.getProperty("line.separator"));
        assertEquals(platformDependentExpectedResult, baos.toString());
    }

    @Test
    void notValidRange(){
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final BufferedOutputStream bos = new BufferedOutputStream(baos);

        System.setOut(new PrintStream(bos));
        var obj = new FizzBizzImpl();
        obj.fizzBizzImplementation(0, 2);
        System.out.flush();

        assertEquals("Please input valid positive range\n", baos.toString());
    }

}