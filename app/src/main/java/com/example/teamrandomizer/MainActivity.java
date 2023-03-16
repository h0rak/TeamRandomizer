package com.example.teamrandomizer;

import android.os.Bundle;
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
    String[] spanishTeams;
    String[] italianTeams;
    String[] germanTeams;
    String[] frenchTeams;
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
        spanishTeams = getResources().getStringArray(R.array.spa_teams);
        italianTeams = getResources().getStringArray(R.array.ita_teams);
        germanTeams = getResources().getStringArray(R.array.ger_teams);
        frenchTeams = getResources().getStringArray(R.array.fra_teams);
        internationalTeams = getResources().getStringArray(R.array.int_teams);

        threeTeamButton.setOnClickListener(v -> {
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
                    team1.setText(spanishTeams[new Random().nextInt(spanishTeams.length)]);
                    team2.setText(spanishTeams[new Random().nextInt(spanishTeams.length)]);
                    team3.setText(spanishTeams[new Random().nextInt(spanishTeams.length)]);
                    break;
                case 3:
                    team1.setText(italianTeams[new Random().nextInt(italianTeams.length)]);
                    team2.setText(italianTeams[new Random().nextInt(italianTeams.length)]);
                    team3.setText(italianTeams[new Random().nextInt(italianTeams.length)]);
                    break;
                case 4:
                    team1.setText(germanTeams[new Random().nextInt(germanTeams.length)]);
                    team2.setText(germanTeams[new Random().nextInt(germanTeams.length)]);
                    team3.setText(germanTeams[new Random().nextInt(germanTeams.length)]);
                    break;
                case 5:
                    team1.setText(frenchTeams[new Random().nextInt(frenchTeams.length)]);
                    team2.setText(frenchTeams[new Random().nextInt(frenchTeams.length)]);
                    team3.setText(frenchTeams[new Random().nextInt(frenchTeams.length)]);
                    break;
                case 6:
                    team1.setText(internationalTeams[new Random().nextInt(internationalTeams.length)]);
                    team2.setText(internationalTeams[new Random().nextInt(internationalTeams.length)]);
                    team3.setText(internationalTeams[new Random().nextInt(internationalTeams.length)]);
                    break;
            }
        });

        oneTeamButton.setOnClickListener(v -> {
            switch (leagueSpinner.getSelectedItemPosition()) {
                case 0:
                    break;
                case 1:
                    team4.setText(englishTeams[new Random().nextInt(englishTeams.length)]);
                    break;
                case 2:
                    team4.setText(spanishTeams[new Random().nextInt(spanishTeams.length)]);
                    break;
                case 3:
                    team4.setText(italianTeams[new Random().nextInt(italianTeams.length)]);
                    break;
                case 4:
                    team4.setText(germanTeams[new Random().nextInt(germanTeams.length)]);
                    break;
                case 5:
                    team4.setText(frenchTeams[new Random().nextInt(frenchTeams.length)]);
                    break;
                case 6:
                    team4.setText(internationalTeams[new Random().nextInt(internationalTeams.length)]);
                    break;
            }
        });
    }
}