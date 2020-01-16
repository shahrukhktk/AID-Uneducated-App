package fyp.srk.aiduneducateddeafdumb.CountingNumbers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import fyp.srk.aiduneducateddeafdumb.R;

public class CountingNumbers extends AppCompatActivity
{
    private ImageView imageReplacer;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting_numbers);

        toolbar = findViewById(R.id.countingToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Counting Numbers Signs");
        imageReplacer = findViewById(R.id.MathNum_image_ID);

    }

    public void clickOne(View view) {
        imageReplacer.setImageResource(R.drawable.one);
    }
    public void clickTwo(View view) {
        imageReplacer.setImageResource(R.drawable.two);
    }

    public void clickThree(View view) {
        imageReplacer.setImageResource(R.drawable.three);
    }

    public void clickFour(View view) {
        imageReplacer.setImageResource(R.drawable.four);
    }

    public void clickFive(View view) {
        imageReplacer.setImageResource(R.drawable.five);
    }

    public void clickSix(View view) {
        imageReplacer.setImageResource(R.drawable.six);
    }

    public void clickSeven(View view) {
        imageReplacer.setImageResource(R.drawable.seven);
    }

    public void clickEight(View view) {
        imageReplacer.setImageResource(R.drawable.eight);
    }

    public void clickNine(View view) {
        imageReplacer.setImageResource(R.drawable.nine);
    }

    public void clickTen(View view) {
        imageReplacer.setImageResource(R.drawable.ten);
    }
}
