package com.gostugo.wookbook;
import java.util.List;
import java.util.ArrayList;


public class Main {

    int FLAGGED = 1;
    int STATUS_VALUE = 5;
    ArrayList<int[]> gameBoard;

    // BAD:
    int d; // elapsed time in days

    // GOOD:
    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
            flaggedCells.add(cell);
        return flaggedCells;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
