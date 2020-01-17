package fyp.srk.aiduneducateddeafdumb.EmotionsAndFeelingsSigns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import fyp.srk.aiduneducateddeafdumb.R;

public class EmotionsAndFeelingsSignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotions_and_feelings_sign);

        Toolbar toolbar = findViewById(R.id.emotionsSigns_toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Emotions Signs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
