
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }
    private static void shuffleArray(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
    }
}
