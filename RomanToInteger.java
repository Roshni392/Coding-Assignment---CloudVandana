
import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        // Convert the Roman numeral to an integer
        int decimal = romanToDecimal(romanNumeral);

        // Display the converted integer
        System.out.println("Converted to Integer: " + decimal);

        // Close the scanner
        scanner.close();
    }

    // Function to convert Roman to Decimal
    private static int romanToDecimal(String romanNumeral) {
        // Create a HashMap to store Roman numeral values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Traverse the Roman numeral string from right to left
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentSymbol = romanNumeral.charAt(i);
            int currentValue = romanValues.get(currentSymbol);

            // If the current value is less than the previous, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return result;
    }
}
