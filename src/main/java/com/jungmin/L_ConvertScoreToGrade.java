package com.jungmin;

public class L_ConvertScoreToGrade {
    public char convertScoreToGrade(int score) {
        char grade;
        if (score > 100 || score < 0) {
            return 'X';
        }
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
