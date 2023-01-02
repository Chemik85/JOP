import java.util.Scanner;

public class Prime_numbers{
    public static void main(String[] arg){
            System.out.println("Podaj liczbę a ja powiem czy jest liczba pierwszą :) ");
            int numbers = getInt();
            for (int divisor = 2; divisor <= numbers; divisor++) {
                if (divisor == numbers) {
                    System.out.println("Liczba " + numbers + " jest liczba pierwszą.");
                    break;
                    } else
                    if (divisibility(numbers, divisor)) {
                       // System.out.println(numbers % divisor);
                        continue;
                    } //else {
                        System.out.println("Liczba " + numbers + " nie jest liczbą pierwszą.");
                        break;
                    //}

            }

    }
    public static boolean divisibility(int num, int div){
        return (num%div != 0);

    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}