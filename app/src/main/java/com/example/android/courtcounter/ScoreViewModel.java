package com.example.android.courtcounter;

import androidx.lifecycle.ViewModel;

/**
 * Created by Tarek on 28-Apr-19.
 */
public class ScoreViewModel extends ViewModel {

    // Tracks the score for Team A
    private int scoreTeamA = 0;

    // Tracks the score for Team B
    private int scoreTeamB = 0;

    // Track foul for Team A
    private int foulTeamA = 0;

    // Track foul for Team B
    private int foulTeamB = 0;

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }

    public int getFoulTeamA() {
        return foulTeamA;
    }

    public void setFoulTeamA(int foulTeamA) {
        this.foulTeamA = foulTeamA;
    }

    public int getFoulTeamB() {
        return foulTeamB;
    }

    public void setFoulTeamB(int foulTeamB) {
        this.foulTeamB = foulTeamB;
    }
}
