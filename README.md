[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/Xiazrfk6)
# Variables, User Input, Conditional Logic and Loops

Programming Languages 2

### 💻 01

Use the code skeleton in the e01/E01.java file.

Create a program that declares and initializes the following variables:
- An integer named "x" with a value of 10
- A floating-point number named "y" with a value of 5.5
- A boolean named "flag" with a value of true
- A character named "letter" with a value of 'c'
- A short integer named "year" with a value of 2022
- A long integer named "population" with a value of 7000000000
- A byte named "num" with a value of 100
- A double named "pi" with a value of 3.13457599923384753929348

Print the variables to the console in the same order
```
// Expected output
10
5.5
true
c
2022
7000000000
100
3.1345759992338476
```

### 💻 02

Use the code skeleton in the e02/E02.java file.
Write a program that will ask the user for 2 numbers. Print the result

- when added together
- when multiplied
- when subtracted
- when divided

```
// Expected flow
Give a number:
5
Give another number:
5

5 + 5 = 10
5 - 5 = 0
5 * 5 = 25
5 / 5 = 1
```

### 💻 03

Use the code skeleton in the e03/E03.java file.
Write a program that asks the user for a number. Evaluate the number and tell the user if it is a positive or negative number.

    Enter a number:
    7
    Positive number

    Enter a number:
    -7
    Negative number

### 💻 04

Use the code skeleton in the e04/E04.java file.
Write a program that asks the day and month from the user. If the day is 24 and month is 12 then wish the user a “Merry Christmas”.

```
// Expected flow

Enter a day:
24
Enter a month:
12
Merry Cristmas

Enter a day:
8
Enter a month:
8
```

### 💻 05

Use the code skeleton in the e05/E05.java file.
Write a program that asks the user for a number between 1 and 7. Print out on screen the corresponding day of the week (1 = Monday, 2 = Tuesday, etc.) using a switch statement. If the number is not between 1 and 7, then remind the user that there is only 7 days in a week.

```
// Expected flow
Enter a number:
1
Monday
Enter a number:
8
Only 7 days in a week
```

### 💻 06

Use the code skeleton in the e06/E06.java file.
Write a program that asks the user which multiplication table they want to see. Let the program print to screen the multiplication table until 10.

```
// Expected flow
Which multiplication table to show?
5

0 x 5 = 0
1 x 5 = 5
2 x 5 = 10
3 x 5 = 15
4 x 5 = 20
5 x 5 = 25
6 x 5 = 30
7 x 5 = 35
8 x 5 = 40
9 x 5 = 45
10 x 5 = 50
```

### 💻 07

Use the code skeleton in the e07/E07.java file.
Make a copy of the above program but now ask the user which multiplicand and until which multiplier multiplication table they want to see. Let the program print to screen the multiplication table until the desired multiplier.

```
// Expected flow
Which multiplicand multiplication table to show?
2
Until which multiplyer?
6

1 x 2 = 2
2 x 2 = 4
3 x 2 = 6
4 x 2 = 8
5 x 2 = 10
6 x 2 = 12
```

### 💻 08

Use the code skeleton in the e08/E08.java file.
Write a program that will tell a user if a positive number is odd or even, the program will keep asking a new number until the user enter 0.

💡Using modulo % to print if number is odd or even. Modulo returns the remainder when a division is done. 5 % 2 = 1, 4 % 2 = 0

```
// Expected flow
Give a number (0 to quit):
9
Number is odd
Give a number (0 to quit):
12
Number is even
Give a number (0 to quit):
0

```

### 💻 09

Use the code skeleton in the e09/E09.java file.
Write a program that will help a teacher calculate the average for a test.

- As long as there are more test scores, add them to the total
- Divide the total by the number of scores entered
- Print the corresponding current average
- Stop when the teacher enters -1

```

// Expected flow
Give a test score (-1 to quit):
15
Average: 15.0
Give a test score (-1 to quit):
20
Average: 17.5
Give a test score (-1 to quit):
-1
```

### 🏆 Bonus 1

Points: 2

Use the code skeleton in the b01/B01.java file.

The Bottles of Drink Song
https://www.youtube.com/watch?v=duk0kwct_9I

Create a program that will take the starting count for the amount of bottles of drinks that are on the wall from the user. Let the program count backwards and print the lyrics of the song until there is no bottles left on the wall.

> 99 bottles of beer on the wall, 99 bottles of beer.
> Take one down and pass it around, 98 bottles of beer on the wall.
>
> 98 bottles of beer on the wall, 98 bottles of beer.
> Take one down and pass it around, 97 bottles of beer on the wall.
>
> ... ✂️ …
>
> 1 bottle of beer on the wall, 1 bottle of beer
> Take one down and pass it around, no more bottles of beer on the wall.
>
> No more bottles of beer on the wall, no more bottles of beer.
> Go to the store and buy some more, <99> bottles of beer on the wall.

# 🍻

