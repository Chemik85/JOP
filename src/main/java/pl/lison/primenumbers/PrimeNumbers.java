package pl.lison.primenumbers;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] arg) {

        System.out.println("Podaj liczbę a ja powiem czy jest liczba pierwszą :) ");
        int numbers = new Scanner(System.in).nextInt();

        String prime = String.format("Liczba %d jest liczbę pierwszą.", numbers);
        String nonPrime = String.format("Liczba %d nie jest liczbą pierwszą.", numbers);

        for (int divisor = 2; divisor <= numbers; divisor++) {
            if (divisor == numbers) {
                System.out.println(prime);
                break;
            } else if (divisibility(numbers, divisor)) {

                continue;
            }
            System.out.println(nonPrime);
            break;
        }
    }

    public static boolean divisibility(int num, int div) {
        return (num % div != 0);

    }

}