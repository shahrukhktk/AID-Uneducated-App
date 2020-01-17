package fyp.srk.aiduneducateddeafdumb.FamilyMembers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import fyp.srk.aiduneducateddeafdumb.R;

public class FamilyMembersActivity extends AppCompatActivity
{
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        toolbar = findViewById(R.id.countingToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Family Members Signs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
