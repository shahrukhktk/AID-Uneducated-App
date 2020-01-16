package fyp.srk.aiduneducateddeafdumb.EnglishAlphabets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import fyp.srk.aiduneducateddeafdumb.EnglishAlphabets.EnglishAlphabetsFragments.A_character;
import fyp.srk.aiduneducateddeafdumb.R;

public class EnglishAlphabetsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabets);



    }

    public void EnglishAlphabets(View view)
    {
        if (view == findViewById(R.id.character_A_Id))
        {
            Fragment fragment = new A_character();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.container_Id, fragment);
            ft.commit();
        }
    }
}
