package com.example.android.footballtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int shotsTeamA = 0;
    int onTargetTeamA = 0;
    int scoreTeamB = 0;
    int shotsTeamB = 0;
    int onTargetTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForTeamA(0);
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        shotsTeamA = 0;
        onTargetTeamA = 0;
        scoreTeamB = 0;
        shotsTeamB = 0;
        onTargetTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayShotsForTeamA(shotsTeamA);
        displayOnTargetForTeamA(onTargetTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayShotsForTeamB(shotsTeamB);
        displayOnTargetForTeamB(onTargetTeamB);
    }

    /**
     * Increase the score for Team A by 1
     */
    public void addGoalForTeamA(View v){
        scoreTeamA++;
        shotsTeamA++;
        onTargetTeamA++;
        displayScoreForTeamA(scoreTeamA);
        displayShotsForTeamA(shotsTeamA);
        displayOnTargetForTeamA(onTargetTeamA);
    }

    /**
     * Increase the score for Team A by 2
     */
    public void addShotForTeamA(View v){
        shotsTeamA++;
        displayShotsForTeamA(shotsTeamA);
    }

    /**
     * Increase the score for Team A by 3
     */
    public void addOnTargetForTeamA(View v) {
        shotsTeamA++;
        onTargetTeamA++;
        displayShotsForTeamA(shotsTeamA);
        displayOnTargetForTeamA(onTargetTeamA);
    }

    public void addOwnGoalForTeamA(View v){
        scoreTeamB++;
        displayScoreForTeamB(scoreTeamB);
    }

    public void addGoalForTeamB(View v){
        scoreTeamB++;
        shotsTeamB++;
        onTargetTeamB++;
        displayScoreForTeamB(scoreTeamB);
        displayShotsForTeamB(shotsTeamB);
        displayOnTargetForTeamB(onTargetTeamB);
    }

    /**
     * Increase the score for Team A by 2
     */
    public void addShotForTeamB(View v){
        shotsTeamB++;
        displayShotsForTeamB(shotsTeamB);
    }

    /**
     * Increase the score for Team A by 3
     */
    public void addOnTargetForTeamB(View v) {
        shotsTeamB++;
        onTargetTeamB++;
        displayShotsForTeamB(shotsTeamB);
        displayOnTargetForTeamB(onTargetTeamB);
    }

    public void addOwnGoalForTeamB(View v){
        scoreTeamA++;
        displayScoreForTeamA(scoreTeamA);
    }


    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayShotsForTeamA(int shots) {
        TextView shotsView = (TextView) findViewById(R.id.team_a_shots_textview);
        shotsView.setText(String.valueOf(shots));
    }

    public void displayOnTargetForTeamA(int onTarget) {
        TextView onTargetView = (TextView) findViewById(R.id.team_a_on_target_textview);
        onTargetView.setText(String.valueOf(onTarget));
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayShotsForTeamB(int shots) {
        TextView shotsView = (TextView) findViewById(R.id.team_b_shots_textview);
        shotsView.setText(String.valueOf(shots));
    }

    public void displayOnTargetForTeamB(int onTarget) {
        TextView onTargetView = (TextView) findViewById(R.id.team_b_on_target_textview);
        onTargetView.setText(String.valueOf(onTarget));
    }
}
