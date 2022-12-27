package refactoring.Solution.FizzBuzz;

public class FizzBuzz {
    public static String getStringOnBasisOfNumber(int number) {

        if(isFactorOfThree(number))
            return "Fizz";
        else if(isFactorOfFive(number))
            return "Buzz";
        else if(isFactorOfThree(number) && isFactorOfFive(number))
            return "FizzBuzz";
        else
            return String.valueOf(number);
    }

    private static boolean isFactorOfThree(int n){
        return n % 3 == 0;
    }
    private static boolean isFactorOfFive(int n){
        return n % 5 == 0;
    }
}