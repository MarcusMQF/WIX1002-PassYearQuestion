# Flowchart and Notes for the Java Program (Q1b)

## Flowchart

1. **Start**
2. **Initialize variables**:
   - `fraction_sum = 0`
   - `n` (user input)
3. **Display Prompt**: "Enter a number:"
4. **User Input**: 
   - Get the value of `n` from the user.
5. **Loop (from 1 to n)**:
   - For each `i` from 1 to `n`, add `1.0 / i` to `fraction_sum`.
6. **Display Result**: Print the sum of the series.
7. **End**

---

## Notes for the Code

### Overview

This Java program calculates the sum of the series `1/1 + 1/2 + 1/3 + ... + 1/n`, where `n` is an integer provided by the user.

### Key Concepts

- **Scanner**: Used to take user input.
- **For Loop**: The program uses a `for` loop to iterate through numbers from `1` to `n` and add their fractions to the total sum.
- **Double Arithmetic**: The `fraction_sum` is of type `double` to accommodate fractional numbers.

### Steps in the Program

1. **Initialization**:
   - The program initializes `fraction_sum` to `0` to accumulate the sum of the fractions.
   - `n` is initialized to the value entered by the user.

2. **User Input**:
   - The program prompts the user to input a number `n`, which represents how many terms of the series to sum.

3. **For Loop**:
   - The program uses a `for` loop that starts from `1` and runs up to `n`.
   - In each iteration of the loop, the program adds `1.0 / i` to `fraction_sum`. This accumulates the sum of the fractional terms.

4. **Display the Result**:
   - After the loop finishes, the program prints the final sum of the series.

### Example

- **Input**:
