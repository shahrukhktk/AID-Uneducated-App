package fyp.srk.aiduneducateddeafdumb.TimeSigns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import fyp.srk.aiduneducateddeafdumb.R;

public class TimeSignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_sign);

        Toolbar toolbar = findViewById(R.id.timesign_toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Time Signs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
