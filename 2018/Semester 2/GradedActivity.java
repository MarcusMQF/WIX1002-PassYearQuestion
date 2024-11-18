public class GradedActivity {
    private double numericScore;
    private char letterGrade;

    public void setScore(double score) {
        numericScore = score;
        setLetterGrade();
    }

    private void setLetterGrade() {
        if (numericScore >= 90)
            letterGrade = 'A';
        else if (numericScore >= 80)
            letterGrade = 'B';
        else if (numericScore >= 70)
            letterGrade = 'C';
        else if (numericScore >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';
    }

    public double getScore() {
        return numericScore;
    }

    public char getLetterGrade() {
        return letterGrade;
    }
}
