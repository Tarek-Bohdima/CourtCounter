package com.example.android.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {


    ScoreViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        displayForTeamA(mViewModel.getScoreTeamA());
        displayForTeamB(mViewModel.getScoreTeamB());
        displayFoulsForTeamA(mViewModel.getFoulTeamA());
        displayFoulsForTeamB(mViewModel.getFoulTeamB());
    }


    /**
     * Reset score for Team A and Team B
     */
    public void reset(View v) {
        mViewModel.setScoreTeamA(0);
        mViewModel.setScoreTeamB(0);
        mViewModel.setFoulTeamA(0);
        mViewModel.setFoulTeamB(0);
        displayForTeamA(mViewModel.getScoreTeamA());
        displayForTeamB(mViewModel.getScoreTeamB());
        displayFoulsForTeamA(mViewModel.getFoulTeamA());
        displayFoulsForTeamB(mViewModel.getFoulTeamB());

    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        mViewModel.setScoreTeamA(mViewModel.getScoreTeamA() + 1);
        displayForTeamA(mViewModel.getScoreTeamA());
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        mViewModel.setScoreTeamA(mViewModel.getScoreTeamA() + 2);
        displayForTeamA(mViewModel.getScoreTeamA());
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        mViewModel.setScoreTeamA(mViewModel.getScoreTeamA() + 3);
        displayForTeamA(mViewModel.getScoreTeamA());
    }

    /**
     * Increase the foul for Team A by 1 point.
     */
    public void addFoulForTeamA(View v) {
        mViewModel.setFoulTeamA(mViewModel.getFoulTeamA() + 1);
        displayFoulsForTeamA(mViewModel.getFoulTeamA());
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        mViewModel.setScoreTeamB(mViewModel.getScoreTeamB() + 1);
        displayForTeamB(mViewModel.getScoreTeamB());
    }

    /**
     * Increase the score for Team B by 2 point.
     */
    public void addTwoForTeamB(View v) {
        mViewModel.setScoreTeamB(mViewModel.getScoreTeamB() + 2);
        displayForTeamB(mViewModel.getScoreTeamB());
    }

    /**
     * Increase the score for Team B by 3 point.
     */
    public void addThreeForTeamB(View v) {
        mViewModel.setScoreTeamB(mViewModel.getScoreTeamB() + 3);
        displayForTeamB(mViewModel.getScoreTeamB());
    }

    /**
     * Increase the foul for Team B by 1 point.
     */
    public void addFoulForTeamB(View v) {
        mViewModel.setFoulTeamB(mViewModel.getFoulTeamB() + 1);
        displayFoulsForTeamB(mViewModel.getFoulTeamB());
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulsForTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayFoulsForTeamB(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(fouls));
    }
}
