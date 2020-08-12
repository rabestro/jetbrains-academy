import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var list = new ArrayList<String>();

        for (boolean isOdd = false; scanner.hasNext(); isOdd ^= true) {
            final var number = scanner.next();
            if (isOdd) {
                list.add(number);
            }
        }
        Collections.reverse(list);
        System.out.println(String.join(" ", list.toArray(String[]::new)));
    }
}
