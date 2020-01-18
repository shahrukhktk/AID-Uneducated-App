package fyp.srk.aiduneducateddeafdumb.Greetings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import fyp.srk.aiduneducateddeafdumb.R;

public class GreetingsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);

        Toolbar toolbar = findViewById(R.id.greetings_toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Greetings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
