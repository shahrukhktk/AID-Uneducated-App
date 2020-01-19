package fyp.srk.aiduneducateddeafdumb.MarksSection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fyp.srk.aiduneducateddeafdumb.R;

public class MarksDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks_dashboard);

        Toolbar toolbar = findViewById(R.id.marksSectionToolbar_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Marks Dashboard");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void Launch_EnglishAlphabetsMarks(View view) {
        startActivity(new Intent(getApplicationContext(), MarksSheet.class));
    }

    public void Launch_CountingNumbersMarks(View view) {
        startActivity(new Intent(getApplicationContext(), MarksSheet.class));
    }

    public void Launch_FamilyMembersMarks(View view) {
        startActivity(new Intent(getApplicationContext(), MarksSheet.class));
    }

    public void Launch_GreetingsMarks(View view) {
        startActivity(new Intent(getApplicationContext(), MarksSheet.class));
    }

    public void Launch_DaysOfTheWeekMarks(View view) {
        startActivity(new Intent(getApplicationContext(), MarksSheet.class));
    }

    public void Launch_TimeActivityMarks(View view) {
        startActivity(new Intent(getApplicationContext(), MarksSheet.class));
    }

    public void Launch_ColorsActivityMarks(View view) {
        startActivity(new Intent(getApplicationContext(), MarksSheet.class));
    }

    public void Launch_EmotionsActivityMarks(View view) {
        startActivity(new Intent(getApplicationContext(), MarksSheet.class));
    }
}
