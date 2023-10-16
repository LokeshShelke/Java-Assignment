import java.util.Scanner;

public class pangram 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        if (isPangram(input))
        {
            System.out.println("The input is a pangram.");
        }
        else
        	{
             System.out.println("The input is not a pangram.");
        	}
    }

    public static boolean isPangram(String input)
    {
        boolean[] letters = new boolean[26];
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z')
            {
               letters[c - 'a'] = true;
            }
        }
        
        for (boolean letter : letters) 
        {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}
