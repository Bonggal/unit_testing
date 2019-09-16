package main.java.FizzBuzz;

public class FizzBuzz {
    public String evaluateFizzBuzz(int number) {
        String result = "";
        if (number % 3 == 0)
            result += "Fizz";

        if (number % 5 == 0)
            result += "Buzz";

        if (number % 3 != 0 && number % 5 != 0)
            result += number;

        return result;
    }
}
