# Using range instead of for loop

## Linear search in Java. The first occurrence in the subarray 

Classic
```
public static int searchInSubArray(int[] numbers, int startIndex, int endIndex, int value) {
    for (int i = startIndex; i < endIndex; i++) {
        if (numbers[i] == value) {
            return i;
        }
    }
    return -1;
}
```

Stream
```
public static int searchInSubArray(int[] numbers, int startIndex, int endIndex, int value) {
    // write your code here
    return IntStream.range(startIndex, endIndex)
            .filter(i -> value == numbers[i])
            .findFirst()
            .orElse(-1);
}
```
