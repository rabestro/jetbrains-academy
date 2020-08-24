import java.util.List;
import static java.util.Collections.frequency;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        return frequency(list1, elem) == frequency(list2, elem);
    }
}
