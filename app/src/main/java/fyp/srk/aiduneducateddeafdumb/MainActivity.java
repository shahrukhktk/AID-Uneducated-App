package fyp.srk.aiduneducateddeafdumb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fyp.srk.aiduneducateddeafdumb.EnglishAlphabets.EnglishAlphabetsActivity;

public class MainActivity extends AppCompatActivity
{
    private Button startquiz_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startquiz_Btn = (Button) findViewById(R.id.startQuiz_BtnId);
        startquiz_Btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });

    }

    public void Launch_EnglishAlphabets(View view)
    {
        startActivity(new Intent(getApplicationContext(), EnglishAlphabetsActivity.class));
    }

    public void Launch_CountingNumbers(View view)
    {

    }

    public void Launch_FamilyMembers(View view)
    {

    }

    public void Launch_Greetings(View view)
    {

    }

    public void Launch_DaysOfTheWeek(View view)
    {

    }

    public void Launch_TimeActivity(View view)
    {

    }

    public void Launch_ColorsActivity(View view)
    {

    }

    public void Launch_EmotionsActivity(View view)
    {

    }
}
