package com.example.android.courtcounterforamericanfootball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.courtcounterforamericanfootball.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int flagsB = 0;
    int flagsA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0   );
    }
    /**
     * Increase the score for Theam A by 6 points.
     */
    public void add6points (View view) {;
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Theam A by 3 points.
     */
    public void add3points (View view) {;
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Theam A by 2 points.
     */
    public void add2points (View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Theam A by 1 point.
     */
    public void add1points (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Theam B by 6 points.
     */
    public void add6pointsB (View view) {;
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Theam B by 3 points.
     */
    public void add3pointsB (View view) {;
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Theam B by 2 points.
     */
    public void add2pointsB (View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Theam B by 1 point.
     */
    public void add1pointsB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Reset the score for both teams back to 0.
     */
    public void ResetButton (View view) {;
        scoreTeamA = 0;
        scoreTeamB = 0;
        flagsA = 0;
        flagsB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayNumberOfFlagsB(flagsB);
        displayNumberOfFlagsA(flagsA);
    }

    /**
     * This method is called when the plus button in Theam B is clicked.
     */
    public void incrementTheamB(View view) {
        flagsB++;
        displayNumberOfFlagsB(flagsB);
    }
    /**
     * This method is called when the minus button in Theam B is clicked.
     */
    public void decrementTheamB(View view) {
        if (flagsB == 0) {
            // Show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 flags", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        flagsB--;
        displayNumberOfFlagsB(flagsB);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayNumberOfFlagsB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.flagsTheamB);
        quantityTextView.setText("" + number);
    }
    /**
     * This method is called when the plus button in Theam A is clicked.
     */
    public void incrementTheamA(View view) {
        flagsA++;
        displayNumberOfFlagsA(flagsA);
    }
    /**
     * This method is called when the minus button in Theam A is clicked.
     */
    public void decrementTheamA(View view) {
        if (flagsA == 0) {
            // Show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 flags", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        flagsA--;
        displayNumberOfFlagsA(flagsA);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayNumberOfFlagsA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.flagsTheamA);
        quantityTextView.setText("" + number);
    }
}