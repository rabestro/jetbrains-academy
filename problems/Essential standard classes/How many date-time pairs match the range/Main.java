import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var range = scanner.tokens()
                .limit(2)
                .map(LocalDateTime::parse)
                .sorted()
                .toArray(LocalDateTime[]::new);

        final var numberDateTimePairs = scanner.nextInt();

        final var result = scanner.tokens()
                .limit(numberDateTimePairs)
                .map(LocalDateTime::parse)
                .filter(dt -> !dt.isBefore(range[0]) && dt.isBefore(range[1]))
                .count();

        System.out.println(result);
    }
}
