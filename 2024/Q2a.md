# Book Class Program (Q2a)

## Flowchart Description

The flowchart for the given program can be broken down into the following steps:

1. **Start**: The program begins execution.
2. **Create Book Object**: A `book` object `b1` is created with the following details:
   - Title: "The Great Gatsby"
   - Author: "F. Scott Fitzgerald"
   - Year: 1925
3. **Display Book Details**:
   - Use `getTitle()` to print the title of the book.
   - Use `getAuthor()` to print the author of the book.
   - Use `getYear()` to print the year the book was published.
4. **End**: The program completes execution.

### Flowchart Steps

1. **Start** 
2. **Create book object (b1)**
   - Pass title, author, and year to the constructor.
3. **Display book details** (using getter methods):
   - `getTitle()`
   - `getAuthor()`
   - `getYear()`
4. **End**

The flowchart illustrates the linear flow of the program from creating the `book` object to displaying the book details.

## Program Description

This Java program defines a `book` class with private fields for the title, author, and year. It uses a constructor to initialize these fields and getter methods to access the values.

### Code Explanation:

1. **Class `book`**:
    - **Private Fields**: 
      - `title`: Represents the book's title (String).
      - `author`: Represents the book's author (String).
      - `year`: Represents the publication year of the book (int).
    - **Constructor**:
      - Initializes the fields `title`, `author`, and `year` when a `book` object is created.
    - **Getter Methods**:
      - `getTitle()`: Returns the book's title.
      - `getAuthor()`: Returns the author's name.
      - `getYear()`: Returns the publication year of the book.

2. **Main Method (Q2a)**:
    - Creates an instance of the `book` class named `b1` with specific details ("The Great Gatsby", "F. Scott Fitzgerald", 1925).
    - Prints the details of the book using the getter methods.

### Output

When the program runs, the output is:

