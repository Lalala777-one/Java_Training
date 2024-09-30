package homeWork_14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W',
                'X', 'Z', 'Y', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'w', 'x', 'z', 'y'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new word: ");
        String word = scanner.nextLine();

        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if(isInArray (letter, vowels)){
                vowelsCount++;
            }else if (isInArray (letter, consonants)){
                consonantsCount++;
            }
        }

        System.out.println("Количество гласных : " + vowelsCount);
        System.out.println("Количество согласных : " + consonantsCount);


    }

    //

    private static boolean isInArray (char c, char[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c){
                return true;
            }
        }
        return false;
    }
    }

