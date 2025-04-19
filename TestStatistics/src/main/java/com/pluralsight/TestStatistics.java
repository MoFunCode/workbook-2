package com.pluralsight;

public class TestStatistics {

    /* Step 1:
       Create a Java application named TestStatistics.
       Create an array of 10 test scores.
       Print out the following statistics:
       - Average
       - High score
       - Low score
       BONUS: Calculate and display the median value
       (and note the difference between the average and median).
    */

    public static void main(String[] args) {

        // Created an array with 10 test scores using direct initialization for simplicity.
        int[] testScores = {85, 92, 78, 65, 88, 72, 93, 77, 82, 90};

        // Calculated the average:
        // Used a for-each loop to add up all the scores, then divided by the number of scores.
        // Used a double to ensure the result includes decimals.
        double sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        double average = sum / testScores.length;
        System.out.println("Average score: " + average);

        // Found the highest score:
        // Started with the first score, then updated if a higher one was found.
        int highScore = testScores[0];
        for (int score : testScores) {
            if (score > highScore) {
                highScore = score;
            }
        }
        System.out.println("High score: " + highScore);

        // Found the lowest score:
        // Started with the first score, then updated if a lower one was found.
        int lowScore = testScores[0];
        for (int score : testScores) {
            if (score < lowScore) {
                lowScore = score;
            }
        }
        System.out.println("Low score: " + lowScore);
    }
}
