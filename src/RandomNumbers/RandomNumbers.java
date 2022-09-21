package RandomNumbers;

import java.awt.*;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int[] randomNumbers = GenerateNumbers(5);

        DisplayArray(randomNumbers);

        OptionalInt minNumber = Arrays.stream(randomNumbers).min();

        System.out.println("\nThe lowest number: " + minNumber);
    }


    private static int[] GenerateNumbers(int sizeOfArray){
        int[] randomNumbers = new int[sizeOfArray];
        Random rand = new Random();

        for(int i=0;i<randomNumbers.length;i++) {
            randomNumbers[i] = rand.nextInt();
        }
        return randomNumbers;
    }

    private static void DisplayArray(int[] numbersArray) {
        System.out.println("Your array");
        for(int i : numbersArray) {
            System.out.print(i+" ");
        }
    }

    private static int Min(int[] numberArray){
        int minimum = numberArray[0];

        for(int i=1;i<numberArray.length;i++) {
            minimum = Math.min(minimum, numberArray[i]);
        }

        return minimum;
    }
}
