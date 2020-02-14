import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ACM {
    public static void main(String[] args) {
        Map<Character, Score> scores = new HashMap<Character, Score>();
        Scanner s = new Scanner(System.in);
        while (true) {
            int time = s.nextInt();
            if (time == -1) {
                break;
            }
            char prob = s.next().charAt(0);
            boolean correct = s.next().equals("right");
            Score score = scores.get(prob);
            if (score == null) {
                score = new Score();
            }
            score.addScore(time, correct);
            scores.put(prob, score);
        }
        s.close();
        int totalScore = 0;
        int totalCorrect = 0;
        for (Map.Entry<Character, Score> scr : scores.entrySet()) {
            totalScore += scr.getValue().getScore();
            if (scr.getValue().isCorrect()) {
                totalCorrect++;
            }
        }
        System.out.printf("%d %d", totalCorrect, totalScore);
    }
}

class Score {
    private int time;
    private int penalty;
    private boolean correct;

    public Score() {
        this.time = 0;
        this.correct = false;
    }

    public void addScore(int time, boolean correct) {
        if (!correct) {
            penalty += 20;
        }
        this.correct = correct;
        this.time = time;
    }

    public int getScore() {
        if (correct) {
            return time + penalty;
        }
        return 0;
    }

    public boolean isCorrect() {
        return correct;
    }

    public String toString() {
        return correct + " " + time + " " + penalty;
    }

}