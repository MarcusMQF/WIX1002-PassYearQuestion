import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Q3{
    public static void main(String[] args) {
        String[] names = new String[10];
        double[] marks = new double[10];
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            String line;
            int i = 0;
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                names[i] = parts[0];
                marks[i] = Double.parseDouble(parts[1]);
                i++;
            }
            reader.close();
            
            // Find highest mark and corresponding student
            double highestMark = -1;
            String highestStudent = "";
            for (i = 0; i < marks.length; i++) {
                if (marks[i] > highestMark) {
                    highestMark = marks[i];
                    highestStudent = names[i];
                }
            }
            
            // Find lowest mark and corresponding student
            double lowestMark = 100;
            String lowestStudent = "";
            for (i = 0; i < marks.length; i++) {
                if (marks[i] < lowestMark) {
                    lowestMark = marks[i];
                    lowestStudent = names[i];
                }
            }
            
            // Count absent students (-1 marks)
            int absentCount = 0;
            for (double mark : marks) {
                if (mark == -1) {
                    absentCount++;
                }
            }
            
            // Print output
            System.out.println("The student with the highest mark : " + highestStudent + " " + (int)highestMark);
            System.out.println("The student with the lowest mark : " + lowestStudent + " " + (int)lowestMark);
            System.out.println("The number of students who were absent from the exam : " + absentCount);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}