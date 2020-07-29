# Random -> Gaussian random numbers 

For the given numbers **K**, **N**, and **M** find the first seed that is greater or equal to **K** where each of **N** Gaussian numbers is less than or equal to **M**.

The input contains numbers **K**, **N**, **M** in a single line.

You should output the seed.

You have to check all **N** iterations of Gaussian generated numbers to be less than or equal to **M**. If that is true, then escape loop and print the seed. If any of the generated numbers is greater than M, then you have to test out the next seed and go to the loop all over again.

Don't get too upset if you still don't understand this problem. Skip it or google for more information.

### Sample Input 1:

0 5 0

### Sample Output 1:

38

### Sample Input 2:

0 5 -1.5

### Sample Output 2:

498666

### Sample Input 3:

10000 1 1.9

### Sample Output 3:

10000
