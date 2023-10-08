
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to check if it's a pangram: ");
        String sentence = scanner.nextLine().toUpperCase();

        // Check if the sentence is a Pangram
        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
        scanner.close();
    }

    // Function to check if a sentence is a pangram
    private static boolean checkPangram(String sentence) {
        // Create a set to store unique uppercase letters
        Set<Character> uniqueLetters = new HashSet<>();

        // Traverse the sentence and add unique uppercase letters to the set
        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                uniqueLetters.add(ch);
            }
        }

        // Check if the set size is equal to the number of letters in the alphabet
        return uniqueLetters.size() == 26;
    }
}
