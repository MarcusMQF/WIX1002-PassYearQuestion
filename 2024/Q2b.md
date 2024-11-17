# Age Validation Program (Q2b)

## Flowchart Description

The flowchart for the given program can be broken down into the following steps:

1. **Start**: The program begins execution.
2. **Input Age**: The user is prompted to enter their age.
3. **Check Age**: The program calls the `checkAge()` method, passing the entered age as an argument.
   - If the age is less than 18, an `InvalidAgeException` is thrown with the message "Invalid age".
   - If the age is 18 or greater, the program prints "Valid age".
4. **Exception Handling**: If an exception is thrown:
   - The `catch` block is executed, displaying the exception message ("Invalid age").
5. **End**: The program completes execution.

### Flowchart Steps

1. **Start**
2. **Prompt for Age**
3. **Check if Age is Less Than 18**:
   - Yes → Throw `InvalidAgeException` (go to step 4).
   - No → Print "Valid age".
4. **Exception Handling**:
   - Display Exception Message ("Invalid age").
5. **End**

### Example Flowchart

1. **Start** 
2. **Input age**
3. **Is age < 18?**
   - **Yes** → Throw `InvalidAgeException` (go to step 4).
   - **No** → Print "Valid age".
4. **Catch Exception**:
   - Print exception message.
5. **End**

## Program Description

This Java program checks if a given age is valid (18 or older) using custom exception handling. If the age is less than 18, the program throws an `InvalidAgeException`.

### Code Explanation:

1. **Class `InvalidAgeException`**:
    - A custom exception class that extends the built-in `Exception` class.
    - The constructor takes a message (in this case, "Invalid age") and passes it to the parent `Exception` class.

2. **Main Method (Q2b)**:
    - A `Scanner` is used to input an age from the user.
    - The program calls the `checkAge()` method to validate the age.
    - If the age is valid (18 or older), "Valid age" is printed.
    - If the age is invalid (less than 18), an `InvalidAgeException` is thrown, and the exception message is printed.

3. **Method `checkAge(int age)`**:
    - This method throws an `InvalidAgeException` if the age is less than 18.
    - If the age is valid, it returns `true`.

4. **Exception Handling**:
    - The `try-catch` block handles the exception. If an invalid age is provided, the exception is caught, and the message is displayed.

### Output

When the program runs:

- If the user enters an age of 18 or greater:
