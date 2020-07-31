# Linear search in Java. The first occurrence in the subarray 

Implement a method to search the index of the first occurrence of a given value in a range of indexes in a given array. The start index should be inclusive and the end index exclusive. If they are equal, suppose the element is not found.

If the value is not found, the method must return -1.

It's guaranteed that startIndex <= endIndex and the array are not empty.

In the test samples below, the first line represents an array of int's, the second line contains start and end indexes, and the third line has an element to search in the array.
Report a typo

## Sample Input 1:
```
19 14 17 15 17
2 5
17
```
## Sample Output 1:
```
2
```
## Sample Input 2:
```
19 14 17 15 17
0 2
17
```
## Sample Output 2:
```
-1
```
