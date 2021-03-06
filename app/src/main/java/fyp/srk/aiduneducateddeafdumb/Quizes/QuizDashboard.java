package fyp.srk.aiduneducateddeafdumb.Quizes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fyp.srk.aiduneducateddeafdumb.R;

public class QuizDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_dashboard);

        Toolbar toolbar = findViewById(R.id.quizSectionToolbar_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Quiz");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void Launch_EnglishAlphabetsQuiz(View view)
    {
        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
    }

    public void Launch_CountingNumbersQuiz(View view) {
        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
    }

    public void Launch_FamilyMembersQuiz(View view) {
        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
    }

    public void Launch_GreetingsQuiz(View view) {
        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
    }

    public void Launch_DaysOfTheWeekQuiz(View view) {
        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
    }

    public void Launch_TimeActivityQuiz(View view) {
        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
    }

    public void Launch_ColorsActivityQuiz(View view) {
        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
    }

    public void Launch_EmotionsActivityQuiz(View view) {
        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
    }
}
