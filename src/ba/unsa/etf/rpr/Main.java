package ba.unsa.etf.rpr;
import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Friend");
        Scanner input = new Scanner(System.in);
        System.out.println("Molimo vas unesite broj: ");
        int number = input.nextInt();
        for(int i = 1; i < number; i++)
            if (i % sumaCifara(i) == 0) System.out.println(sumaCifara(i) + " + " + i);
    }

    static int sumaCifara(int number) {
        int suma = 0;
        while(true) {
            suma = suma + (number%10);
            number = number/10;
            if(number == 0) break;
        }
        return suma;
    }
}
