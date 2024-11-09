# Playable Instruments Program (Q2c)

## Flowchart Description

The flowchart for this program consists of the following steps:

1. **Start**: The program begins execution.
2. **Create Playable Objects**: An array of `Playable` objects is created, consisting of instances of the `Guitar` and `Piano` classes.
3. **Loop through Instruments**: The program loops through each `Playable` object (guitar and piano) in the `instruments` array.
4. **Call Play Method**: For each instrument, the `play()` method is called.
    - The `Guitar` class prints "Playing guitar...".
    - The `Piano` class prints "Playing piano...".
5. **End**: The program finishes execution.

### Flowchart Steps

1. **Start**
2. **Create an array of Playable instruments (Guitar, Piano)**
3. **For each instrument, call `play()` method**:
   - If the instrument is a `Guitar`, print "Playing guitar...".
   - If the instrument is a `Piano`, print "Playing piano...".
4. **End**

### Example Flowchart

1. **Start**
2. **Create array of Playable objects (Guitar, Piano)**
3. **For each instrument in array**:
   - **Guitar** → Call `play()` → Print "Playing guitar..."
   - **Piano** → Call `play()` → Print "Playing piano..."
4. **End**

## Program Description

This Java program demonstrates the use of interfaces and polymorphism by creating an array of objects that implement the `Playable` interface. The program then calls the `play()` method on each object in the array, which results in different behavior based on the class of the object.

### Code Explanation:

1. **Interface `Playable`**:
    - Defines the contract for any class that wants to be considered "playable". The interface includes a single method: `play()`.

2. **Class `Guitar`**:
    - Implements the `Playable` interface and provides an implementation of the `play()` method that prints "Playing guitar...".

3. **Class `Piano`**:
    - Implements the `Playable` interface and provides an implementation of the `play()` method that prints "Playing piano...".

4. **Main Method (Q2c)**:
    - An array of `Playable` objects is created, consisting of instances of `Guitar` and `Piano`.
    - The program loops through each object in the `instruments` array and calls the `play()` method.
    - The specific implementation of `play()` (either for `Guitar` or `Piano`) is invoked depending on the object.

### Output

When the program runs:

