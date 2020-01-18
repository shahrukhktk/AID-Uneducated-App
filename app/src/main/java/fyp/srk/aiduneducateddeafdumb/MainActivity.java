package fyp.srk.aiduneducateddeafdumb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.TooltipCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import fyp.srk.aiduneducateddeafdumb.ColorsSigns.ColorsActivity;
import fyp.srk.aiduneducateddeafdumb.CountingNumbers.CountingNumbers;
import fyp.srk.aiduneducateddeafdumb.DaysNames.DaysSigns;
import fyp.srk.aiduneducateddeafdumb.EmotionsAndFeelingsSigns.EmotionsAndFeelingsSignActivity;
import fyp.srk.aiduneducateddeafdumb.EnglishAlphabets.EnglishAlphabetsActivity;
import fyp.srk.aiduneducateddeafdumb.FamilyMembers.FamilyMembersActivity;
import fyp.srk.aiduneducateddeafdumb.Greetings.GreetingsActivity;
import fyp.srk.aiduneducateddeafdumb.TimeSigns.TimeSignActivity;

public class MainActivity extends AppCompatActivity
{
    private Button startquiz_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.countingToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");

        startquiz_Btn = (Button) findViewById(R.id.startQuiz_BtnId);
        startquiz_Btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "QUIZ", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void Launch_EnglishAlphabets(View view)
    {
        startActivity(new Intent(getApplicationContext(), EnglishAlphabetsActivity.class));
    }

    public void Launch_CountingNumbers(View view)
    {
        startActivity(new Intent(getApplicationContext(), CountingNumbers.class));
    }

    public void Launch_FamilyMembers(View view)
    {
        startActivity(new Intent(getApplicationContext(), FamilyMembersActivity.class));
    }

    public void Launch_Greetings(View view)
    {
        startActivity(new Intent(getApplicationContext(), GreetingsActivity.class));
    }

    public void Launch_DaysOfTheWeek(View view)
    {
        startActivity(new Intent(getApplicationContext(), DaysSigns.class));
    }

    public void Launch_TimeActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), TimeSignActivity.class));
    }

    public void Launch_ColorsActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), ColorsActivity.class));
    }

    public void Launch_EmotionsActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), EmotionsAndFeelingsSignActivity.class));
    }
}
