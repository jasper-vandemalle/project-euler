# Project Euler

[![Build](https://github.com/jasper-vandemalle/project-euler/actions/workflows/build.yml/badge.svg)](https://github.com/jasper-vandemalle/project-euler/actions/workflows/build.yml)

My solutions to [Project Euler](https://projecteuler.net/) problems, in Java.

I started this repo in 2013, early in my career, as a way to learn Java by solving puzzles. In 2026 I gave it a refresh: Java 21, JUnit 6, no runtime dependencies, and fixes for a few bugs the original tests never caught (poker tie-breaks, an off-by-one in the prime sieve, a helper that mutated its input). Problem 8 now solves the current 13-digit version of the puzzle; Project Euler changed it in 2014.

## Solved problems

| #  | Problem                                                              | Approach                                                                  |
|----|----------------------------------------------------------------------|---------------------------------------------------------------------------|
| 1  | [Multiples of 3 or 5](https://projecteuler.net/problem=1)            | Loop and sum                                                              |
| 2  | [Even Fibonacci numbers](https://projecteuler.net/problem=2)         | Walk the sequence                                                         |
| 3  | [Largest prime factor](https://projecteuler.net/problem=3)           | Trial division                                                            |
| 4  | [Largest palindrome product](https://projecteuler.net/problem=4)     | Brute force over pairs of 3-digit numbers                                 |
| 5  | [Smallest multiple](https://projecteuler.net/problem=5)              | Fold `lcm` over 1 to 20                                                   |
| 6  | [Sum square difference](https://projecteuler.net/problem=6)          | Direct computation                                                        |
| 7  | [10 001st prime](https://projecteuler.net/problem=7)                 | Sieve of Atkin, bounded by n (ln n + ln ln n)                             |
| 8  | [Largest product in a series](https://projecteuler.net/problem=8)    | Sliding window over 13 digits                                             |
| 9  | [Special Pythagorean triplet](https://projecteuler.net/problem=9)    | Search with a + b + c fixed                                               |
| 10 | [Summation of primes](https://projecteuler.net/problem=10)           | Sieve of Atkin                                                            |
| 11 | [Largest product in a grid](https://projecteuler.net/problem=11)     | Four directions from every cell                                           |
| 12 | [Highly divisible triangular number](https://projecteuler.net/problem=12) | n and n + 1 are coprime, so count their divisors separately          |
| 13 | [Large sum](https://projecteuler.net/problem=13)                     | `BigInteger`                                                              |
| 14 | [Longest Collatz sequence](https://projecteuler.net/problem=14)      | Memoized chain lengths                                                    |
| 15 | [Lattice paths](https://projecteuler.net/problem=15)                 | Binomial coefficient C(40, 20)                                            |
| 16 | [Power digit sum](https://projecteuler.net/problem=16)               | `BigInteger`                                                              |
| 17 | [Number letter counts](https://projecteuler.net/problem=17)          | Spell out every number                                                    |
| 18 | [Maximum path sum I](https://projecteuler.net/problem=18)            | Bottom-up dynamic programming                                             |
| 19 | [Counting Sundays](https://projecteuler.net/problem=19)              | `java.time`                                                               |
| 20 | [Factorial digit sum](https://projecteuler.net/problem=20)           | `BigInteger`                                                              |
| 21 | [Amicable numbers](https://projecteuler.net/problem=21)              | Divisor sums up to √n                                                     |
| 22 | [Names scores](https://projecteuler.net/problem=22)                  | Sort and score                                                            |
| 24 | [Lexicographic permutations](https://projecteuler.net/problem=24)    | Factorial number system                                                   |
| 25 | [1000-digit Fibonacci number](https://projecteuler.net/problem=25)   | `BigInteger`, compared against 10^999                                     |
| 28 | [Number spiral diagonals](https://projecteuler.net/problem=28)       | Corner pattern per layer                                                  |
| 36 | [Double-base palindromes](https://projecteuler.net/problem=36)       | Check both bases                                                          |
| 48 | [Self powers](https://projecteuler.net/problem=48)                   | `modPow` modulo 10^10                                                     |
| 54 | [Poker hands](https://projecteuler.net/problem=54)                   | One evaluator per hand category; ties ranked by group size, then value    |
| 67 | [Maximum path sum II](https://projecteuler.net/problem=67)           | Same dynamic programming as 18                                            |

## Running

Requires JDK 21.

```sh
./mvnw verify
```

`ProblemTest` runs every solution and checks it against the known answer. The poker hand evaluator and the utilities have their own unit tests.

Code is formatted with [palantir-java-format](https://github.com/palantir/palantir-java-format) through Spotless. `./mvnw spotless:apply` formats everything, and `pre-commit install` sets up a hook that does it on every commit.

## Layout

- `src/main/java/.../problemsNNNtoMMM/ProblemNNN.java`: one class per problem, each implementing `Solvable`
- `src/main/java/.../utils`: prime sieve, math helpers and resource loading
- `src/main/resources`: puzzle input files

## Spoilers

Project Euler asks people not to share solutions beyond the first 100 problems. Everything here is within that range, but if you're working through them yourself, try them before reading the code.
