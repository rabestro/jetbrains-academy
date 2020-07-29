import java.util.Random;
import java.util.Scanner;

import static java.util.stream.IntStream.range;
import static java.util.stream.LongStream.iterate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var initialSeed = scanner.nextInt();
        final var numbersCount = scanner.nextInt();
        final var maxGaussian = scanner.nextDouble();

        iterate(initialSeed, i -> i + 1).filter(seed -> {
            final var random = new Random(seed);
            return range(0, numbersCount).allMatch(i -> random.nextGaussian() <= maxGaussian);
        }).findFirst()
                .ifPresent(System.out::print);
    }
}
