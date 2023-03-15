package com.example.teamrandomizer;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Spinner leagueSpinner;
    Button threeTeamButton;
    Button oneTeamButton;
    TextView team1;
    TextView team2;
    TextView team3;
    TextView team4;
    String[] englishTeams;
    String[] spainTeams;
    String[] italyTeams;
    String[] germanyTeams;
    String[] franceTeams;
    String[] internationalTeams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leagueSpinner = findViewById(R.id.leagueSpinner);
        ArrayAdapter<CharSequence> leagueAdapter = ArrayAdapter.createFromResource(this, R.array.leagues, android.R.layout.simple_spinner_item);
        leagueSpinner.setAdapter(leagueAdapter);
        leagueSpinner.setSelection(0);
        threeTeamButton = findViewById(R.id.randomizeButton);
        oneTeamButton = findViewById(R.id.doOrDieButton);
        team1 = findViewById(R.id.team1TextView);
        team2 = findViewById(R.id.team2TextView);
        team3 = findViewById(R.id.team3TextView);
        team4 = findViewById(R.id.team4TextView);
        englishTeams = getResources().getStringArray(R.array.eng_teams);
        spainTeams = getResources().getStringArray(R.array.spa_teams);
        italyTeams = getResources().getStringArray(R.array.ita_teams);
        germanyTeams = getResources().getStringArray(R.array.ger_teams);
        franceTeams = getResources().getStringArray(R.array.fra_teams);
        internationalTeams = getResources().getStringArray(R.array.int_teams);

        threeTeamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (leagueSpinner.getSelectedItemPosition()) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Please select a league/country", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        team1.setText(englishTeams[new Random().nextInt(englishTeams.length)]);
                        team2.setText(englishTeams[new Random().nextInt(englishTeams.length)]);
                        team3.setText(englishTeams[new Random().nextInt(englishTeams.length)]);
                        break;
                    case 2:
                        team1.setText(spainTeams[new Random().nextInt(spainTeams.length)]);
                        team2.setText(spainTeams[new Random().nextInt(spainTeams.length)]);
                        team3.setText(spainTeams[new Random().nextInt(spainTeams.length)]);
                        break;
                    case 3:
                        team1.setText(italyTeams[new Random().nextInt(italyTeams.length)]);
                        team2.setText(italyTeams[new Random().nextInt(italyTeams.length)]);
                        team3.setText(italyTeams[new Random().nextInt(italyTeams.length)]);
                        break;
                    case 4:
                        team1.setText(germanyTeams[new Random().nextInt(germanyTeams.length)]);
                        team2.setText(germanyTeams[new Random().nextInt(germanyTeams.length)]);
                        team3.setText(germanyTeams[new Random().nextInt(germanyTeams.length)]);
                        break;
                    case 5:
                        team1.setText(franceTeams[new Random().nextInt(franceTeams.length)]);
                        team2.setText(franceTeams[new Random().nextInt(franceTeams.length)]);
                        team3.setText(franceTeams[new Random().nextInt(franceTeams.length)]);
                        break;
                    case 6:
                        team1.setText(internationalTeams[new Random().nextInt(internationalTeams.length)]);
                        team2.setText(internationalTeams[new Random().nextInt(internationalTeams.length)]);
                        team3.setText(internationalTeams[new Random().nextInt(internationalTeams.length)]);
                        break;
                }
            }
        });

        oneTeamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (leagueSpinner.getSelectedItemPosition()) {
                    case 0:
                        break;
                    case 1:
                        team4.setText(englishTeams[new Random().nextInt(englishTeams.length)]);
                        break;
                    case 2:
                        team4.setText(spainTeams[new Random().nextInt(spainTeams.length)]);
                        break;
                    case 3:
                        team4.setText(italyTeams[new Random().nextInt(italyTeams.length)]);
                        break;
                    case 4:
                        team4.setText(germanyTeams[new Random().nextInt(germanyTeams.length)]);
                        break;
                    case 5:
                        team4.setText(franceTeams[new Random().nextInt(franceTeams.length)]);
                        break;
                    case 6:
                        team4.setText(internationalTeams[new Random().nextInt(internationalTeams.length)]);
                        break;
                }
            }
        });
    }
}