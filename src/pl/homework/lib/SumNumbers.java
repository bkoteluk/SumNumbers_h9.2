package pl.homework.lib;

public class SumNumbers {

    public static int sum(int number) {
        int sum = 0;
        int n = number;
        for(int i = 1; i < number; i *= 10) {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }

}
