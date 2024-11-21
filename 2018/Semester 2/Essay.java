public class Essay extends GradedActivity {
    private int grammarScore;
    private int spellingScore;
    private int lengthScore;
    private int contentScore;

    public void setScore(int grammar, int spelling, int length, int content) {
        grammarScore = grammar;
        spellingScore = spelling;
        lengthScore = length;
        contentScore = content;
        
        super.setScore(grammarScore + spellingScore + lengthScore + contentScore); 
        // Pass the total score of the essay
    }

    public int getGrammarScore() {
        return grammarScore;
    }

    public int getSpellingScore() {
        return spellingScore;
    }

    public int getLengthScore() {
        return lengthScore;
    }

    public int getContentScore() {
        return contentScore;
    }
}
