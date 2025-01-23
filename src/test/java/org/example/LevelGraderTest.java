package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelGraderTest {

    @Test
    void thirtyTwoShouldReturnTwo (){
        var grader = new LevelGrader();
        assertEquals('2', grader.determineLevelGrade(32));
    }
    @Test
    void fifteenShouldReturnOne (){
        var grader = new LevelGrader();
        assertEquals('1', grader.determineLevelGrade(15));
    }
    @Test
    void sixtyNineShouldReturnFive (){
        var grader = new LevelGrader();
        assertEquals('5', grader.determineLevelGrade(69));
    }
    @Test
    void fiftyFiveShouldReturnFour (){
        var grader = new LevelGrader();
        assertEquals('4', grader.determineLevelGrade(55));
    }
    @Test
    void fortySevenFiveShouldReturnThree (){
        var grader = new LevelGrader();
        assertEquals('3', grader.determineLevelGrade(47));
    }
    @Test
    void seventyEightFiveShouldReturnSix (){
        var grader = new LevelGrader();
        assertEquals('6', grader.determineLevelGrade(78));
    }

    @Test
    void ninetyTwoShouldReturnSeven (){
        var grader = new LevelGrader();
        assertEquals('7', grader.determineLevelGrade(92));
    }
    @Test
    void negativeOneShouldReturnIllegalArgumentException (){
        var grader = new LevelGrader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLevelGrade(-1);
                });

    }




}