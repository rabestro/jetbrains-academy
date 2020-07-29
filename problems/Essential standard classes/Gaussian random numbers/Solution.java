import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

import static java.util.stream.LongStream.iterate;

public class Solution {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var initialSeed = scanner.nextInt();
        final var numbersCount = scanner.nextInt();
        final var maxGaussian = scanner.nextDouble();

        iterate(initialSeed, i -> i + 1).filter(seed -> {
            final var random = new Random(seed);
            return DoubleStream
                    .generate(random::nextGaussian)
                    .limit(numbersCount)
                    .allMatch(d -> d <= maxGaussian);
        }).findFirst()
                .ifPresent(System.out::print);
    }
}
