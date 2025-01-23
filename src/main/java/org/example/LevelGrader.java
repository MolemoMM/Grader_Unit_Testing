package org.example;

public class LevelGrader {

    public char determineLevelGrade (int numberGrade) {
        if (numberGrade < 0) {
             throw new IllegalArgumentException("Number graded cannot be graded");

        } else if (numberGrade < 30) {
            return '1';
        } else if (numberGrade < 40) {
            return '2';
        } else if (numberGrade < 50) {
            return '3';
        } else if (numberGrade < 60) {
            return '4';
        } else if (numberGrade < 70) {
            return '5';
        } else if (numberGrade < 80) {
            return '6';

        }else {
            return '7';
        }

    }
}
