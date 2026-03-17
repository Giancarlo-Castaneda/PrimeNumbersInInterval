# PrimeNumbersInInterval

## Program Name
PrimeNumbersInInterval
## Description
This program reads two positive integers in the range [2, 20000] and determines how many prime numbers are contained in the inclusive interval defined by those two values.
## Input
A pair of positive integers.
## Example
```
10 20
```
## Output
A non-negative integer representing the number of prime numbers in the interval.
## Example
```
4
```
## Approach
The program performs the following steps:
1. Reads two integers from standard input.
2. Determines the lower and upper bounds of the interval.
3. Iterates through all numbers in that interval.
4. Uses a helper method isPrime(int number) to determine whether each number is prime.
5. Counts the prime numbers found.
6.  the total count.
## Prime Validation Logic
A number is considered prime if:
- it is greater than 1
- it has no divisors other than 1 and itself
