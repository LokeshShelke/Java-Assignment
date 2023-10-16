import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumber = scanner.nextLine();
        int result = romanToInt(romanNumber);
        System.out.println("Integer Value is: " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int temp = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));
            if (currentValue < temp) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            temp = currentValue;
        }

        return result;
    }
}

