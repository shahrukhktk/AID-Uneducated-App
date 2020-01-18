package fyp.srk.aiduneducateddeafdumb.Quizes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import fyp.srk.aiduneducateddeafdumb.R;

public class QuizStartAtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_start_ativity);

        Toolbar toolbar = findViewById(R.id.startquiz_toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Quiz");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
