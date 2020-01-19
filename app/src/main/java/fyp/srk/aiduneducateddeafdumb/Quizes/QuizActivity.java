package fyp.srk.aiduneducateddeafdumb.Quizes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import fyp.srk.aiduneducateddeafdumb.R;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Toolbar toolbar = findViewById(R.id.quizActivityToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Quiz Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
