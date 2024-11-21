// Scanner can be removed since not been used

public class Q1 {
    public static void main(String[] args) {
        int[] num = {69, 15, 12, 27, 74, 23}; // Remove the "" as it is an integer instead of a string
        int cnt = 0;

        for(int i = 0; i < num.length; i++) // Remove () as it is not needed
            if(isOdd(num[i])) // It need to pass the value of the array to the function
                cnt++;

        System.out.println("The number of odd numbers: " + cnt);
        System.out.println("The sum of the array is " + compSum(num));
    }

    public static boolean isOdd(int a){  // Add "static" keyword
        if(a % 2 != 0) // Correct the operator to != from =!
            return true;
        else
            return false;
        
    }

    public static int compSum(int[] a){ // It is not a void function, it should be int as it does return a value
        int total = 0;
        for(int i = 0; i < a.length; i++)
            total += a[i]; // Correct the operator to += from =

        return total;
    }
}
