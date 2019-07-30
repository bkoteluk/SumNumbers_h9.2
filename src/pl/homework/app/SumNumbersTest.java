package pl.homework.app;

import pl.homework.lib.SumNumbers;

public class SumNumbersTest {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Suma cyfr składających się na liczbę " + number
                + " jest równa : " + SumNumbers.sum(number));

    }
}
