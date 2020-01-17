package fyp.srk.aiduneducateddeafdumb.ColorsSigns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import fyp.srk.aiduneducateddeafdumb.R;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        Toolbar toolbar = findViewById(R.id.colorsSign_toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Colors Signs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
