import java.util.Arrays;
import java.util.Random;

public class ShuffleArray
{
    public static void main(String[] args)
    {
         int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
         System.out.println(Arrays.toString(array));
    }
}