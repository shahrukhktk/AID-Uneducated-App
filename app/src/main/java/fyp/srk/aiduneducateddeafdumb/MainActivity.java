package fyp.srk.aiduneducateddeafdumb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.TooltipCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
import fyp.srk.aiduneducateddeafdumb.MarksSection.MarksDashboard;
import fyp.srk.aiduneducateddeafdumb.Quizes.QuizStartAtivity;
import fyp.srk.aiduneducateddeafdumb.TimeSigns.TimeSignActivity;

public class MainActivity extends AppCompatActivity
{
    private Button startquiz_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.mainToolbar_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");

        startquiz_Btn = (Button) findViewById(R.id.startQuiz_BtnId);
        startquiz_Btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), QuizStartAtivity.class));
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_marks:
                startActivity (new Intent (this, MarksDashboard.class));
                break;
        }
        return true;
    }
}
