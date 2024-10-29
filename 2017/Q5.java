import java.util.Scanner;

class GradedActivity{
    private double score;

    public void setScore(double s){
        score = s;
    }

    public double getScore(){
        return score;
    }

    public char getGrade(){
        char letterGrade;
        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';
        return letterGrade;
    }

    @Override
    public String toString(){
        return "Score: " + score + "\nGrade: " + getGrade();
    }

}

class Essay extends GradedActivity{
    private int grammar;
    private int spelling;
    private int length;
    private int content;

    public Essay(int grammar, int spelling, int length, int content){
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        setScore(grammar + spelling + length + content);
    }
      

    @Override
    public String toString(){
        return super.toString() + "\nGrammar: " + grammar + "\nSpelling: " + spelling + "\nLength: " + length + "\nContent: " + content;
    }
}

public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grammar score (maximum 30 marks): ");
        int grammar = sc.nextInt();
        System.out.print("Enter the spelling score (maximum 20 marks): ");
        int spelling = sc.nextInt();
        System.out.print("Enter the length score (maximum 20 marks): ");
        int length = sc.nextInt();
        System.out.print("Enter the content score (maximum 30 marks): ");
        int content = sc.nextInt();

        Essay essay = new Essay(grammar, spelling, length, content);

        System.out.println("\nEssay score:");
        System.out.println(essay.toString());
    }
}