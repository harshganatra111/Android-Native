package com.example.harsh.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    TextView teamAScoreTextView;
    TextView teamBScoreTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScoreTextView = findViewById(R.id.team_A_score);
        teamBScoreTextView = findViewById(R.id.team_B_score);
    }
    public void teamAPlusOne(View view){
        teamAScore += 1;
        teamAScoreTextView.setText(teamAScore + "");
        Log.d(MainActivity.class.getSimpleName(),"Team A Plus One Button Clicked");
        Log.d(MainActivity.class.getSimpleName(),teamAScore +"");
    }
    public void teamAPlusTwo(View view){
        teamAScore += 2;
        teamAScoreTextView.setText(teamAScore + "");
        Log.d(MainActivity.class.getSimpleName(),"Team A Plus Two Button Clicked");
        Log.d(MainActivity.class.getSimpleName(),teamAScore +"");
    }
    public void teamAPlusThree(View view){
        teamAScore += 3;
        teamAScoreTextView.setText(teamAScore + "");
        Log.d(MainActivity.class.getSimpleName(),"Team A Plus Three Button Clicked");
        Log.d(MainActivity.class.getSimpleName(),teamAScore +"");
    }
    public void teamBPlusOne(View view){
        teamBScore += 1;
        teamBScoreTextView.setText(teamBScore + "");
        Log.d(MainActivity.class.getSimpleName(),"Team B Plus One Button Clicked");
        Log.d(MainActivity.class.getSimpleName(),teamBScore +"");
    }
    public void teamBPlusTwo(View view){
        teamBScore += 2;
        teamBScoreTextView.setText(teamBScore + "");
        Log.d(MainActivity.class.getSimpleName(),"Team B Plus Two Button Clicked");
        Log.d(MainActivity.class.getSimpleName(),teamBScore +"");
    }
    public void teamBPlusThree(View view){
        teamBScore += 3;
        teamBScoreTextView.setText(teamBScore + "");
        Log.d(MainActivity.class.getSimpleName(),"Team B Plus Three Button Clicked");
        Log.d(MainActivity.class.getSimpleName(),teamBScore +"");
    }
    public void reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        teamAScoreTextView.setText(teamAScore + "");
        teamBScoreTextView.setText(teamBScore + "");
        Log.d(MainActivity.class.getSimpleName(),"Reset Button Clicked");
    }
}
