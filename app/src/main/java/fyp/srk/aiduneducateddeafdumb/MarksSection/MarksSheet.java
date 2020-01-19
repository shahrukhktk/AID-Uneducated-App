package fyp.srk.aiduneducateddeafdumb.MarksSection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import fyp.srk.aiduneducateddeafdumb.R;

public class MarksSheet extends AppCompatActivity
{

    private RecyclerView recyclerView_Marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks_sheet);

        Toolbar toolbar = findViewById(R.id.marksSectionToolbar_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Marks");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView_Marks = findViewById(R.id.recyclerview_Id);
    }
}
