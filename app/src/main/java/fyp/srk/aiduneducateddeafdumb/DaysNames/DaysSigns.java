package fyp.srk.aiduneducateddeafdumb.DaysNames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import fyp.srk.aiduneducateddeafdumb.R;

public class DaysSigns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_signs);

        Toolbar toolbar = findViewById(R.id.daysnamesSign_toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Days Names Signs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
