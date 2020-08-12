import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean isOdd = false;

        while (scanner.hasNextInt()) {
            if (isOdd) {
                arrayList.add(scanner.nextInt());
            } else {
                scanner.nextInt();
            }
            isOdd = !isOdd;
        }

        for (int i = arrayList.size() - 1; i >= 0; --i) {
            System.out.printf("%d ", arrayList.get(i));
        }
    }
}
