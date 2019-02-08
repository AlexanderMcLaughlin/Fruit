# Fruit

The first line of the input file will contain a number n (1 ≤ n ≤ 200) indicating the number of fruit
stands to process. The information for each fruit stand will be on a single line. Each of these lines
starts with a single positive integer, d (1 ≤ d ≤ 1000) indicating the number of days for which you
are running the fruit stand. This is followed by d space separated integers indicating the number
of fruits sold on each day, in order. All of these values will be in between 0 and 1000, inclusive.
The Output

For each fruit stand, output two integers separated by a space on a line: the minimum number of
fruits for the daily order and the maximum number of extra fruits that are ever stored in the
evening while running the fruit stand.

Sample Input
> 4

>3 3 4 5

>7 10 10 10 10 10 10 10

>4 4 7 1 5

>4 4 7 1 8

Sample Output
>4 1

>10 0

>6 7

>6 6
