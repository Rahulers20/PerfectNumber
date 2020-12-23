public class PerfectNumber {


    public static boolean isPerfectNumber(int number) {
        int value = 0;
        if(number >= 1) {
            for(int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    value += i;
                }
            }
            if(number == (value - number)) {
                return true;
            }
        } return false;
    }
}