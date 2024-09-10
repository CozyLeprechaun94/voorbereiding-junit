package nl.han.aim.oose.dea;

import nl.han.ica.oose.dea.stringkata.StringCalculator;
import nl.han.ica.oose.dea.testedfizzbuzz.FizzBuzzExecutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests {
    private FizzBuzzExecutor sut;
    private StringCalculator sut2;

    @BeforeEach
    public void setup() {
        sut = new FizzBuzzExecutor(); //System under test
        sut2 = new StringCalculator();
    }

    @Test
    public void executeReturnsFizzWhenDivisibleByThree(){
        var testValue = sut.execute(9);

        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    public void executeReturnsBuzzWhenDivisibleByFive() {
        var testValue = sut.execute(10);

        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    public void executeReturnsFizzBuzzWhenDivisibleByFifteen() {
        var testValue = sut.execute(30);

        Assertions.assertEquals("FizzBuzz", testValue);
    }

    @Test
    public void addReturnsZeroWhenEmptyString() {
        var testValue = sut2.add("");

        Assertions.assertEquals(0, testValue);
    }
}
