import java.util.Arrays;

public class Solution {
    public static int minimumNumber(int[] numbers) {

        int result = 0;
        boolean isNotPrime = true;
        int sum = Arrays.stream(numbers).sum();

        while (isNotPrime) {
            if( checkIfPrimeNumber(sum++)){
                isNotPrime = false;
            }else{
                result++;
            }
        }
        return result;
    }

    private static boolean checkIfPrimeNumber(int number){
        for(int i=2;i<number;i++) {
            if(number%i==0)
                return false;
        }
        return true;
    }
}
