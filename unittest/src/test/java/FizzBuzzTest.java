import com.sprinter.ronin.fizzbuzz.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void input_1_print_1() throws Exception {
        int input = 1;
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzbuzz.show(input));

    }

    @Test
    public void input_3_print_Fizz() throws Exception {
        int input = 3;
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzbuzz.show(input));

    }

    @Test
    public void input_5_print_Buzz() throws Exception {
        int input = 5;
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzbuzz.show(input));

    }

    @Test
    public void input_15_print_FizzBuzz() throws Exception {
        int input = 15;
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzbuzz.show(input));

    }
}
