package fyp.srk.aiduneducateddeafdumb.EnglishAlphabets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import fyp.srk.aiduneducateddeafdumb.R;

public class EnglishAlphabetsActivity extends AppCompatActivity
{
    private ImageView imageReplacer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabets);

        imageReplacer = findViewById(R.id.EngAlpha_image_ID);

    }

    public void clickA(View view) {
        imageReplacer.setImageResource(R.drawable.a);
    }

    public void clickB(View view) {
        imageReplacer.setImageResource(R.drawable.b);
    }

    public void clickC(View view) {
        imageReplacer.setImageResource(R.drawable.c);
    }

    public void clickD(View view) {
        imageReplacer.setImageResource(R.drawable.d);
    }

    public void clickE(View view) {
        imageReplacer.setImageResource(R.drawable.e);
    }

    public void clickF(View view) {
        imageReplacer.setImageResource(R.drawable.f);
    }

    public void clickG(View view) {
        imageReplacer.setImageResource(R.drawable.g);
    }

    public void clickH(View view) {
        imageReplacer.setImageResource(R.drawable.h);
    }

    public void clickI(View view) {
        imageReplacer.setImageResource(R.drawable.i);
    }

    public void clickJ(View view) {
        imageReplacer.setImageResource(R.drawable.j);
    }

    public void clickK(View view) {
        imageReplacer.setImageResource(R.drawable.k);
    }

    public void clickL(View view) {
        imageReplacer.setImageResource(R.drawable.l);
    }

    public void clickM(View view) {
        imageReplacer.setImageResource(R.drawable.m);
    }

    public void clickN(View view) {
        imageReplacer.setImageResource(R.drawable.n);
    }

    public void clickO(View view) {
        imageReplacer.setImageResource(R.drawable.o);
    }

    public void clickP(View view) {
        imageReplacer.setImageResource(R.drawable.p);
    }

    public void clickQ(View view) {
        imageReplacer.setImageResource(R.drawable.q);
    }

    public void clickR(View view) {
        imageReplacer.setImageResource(R.drawable.r);
    }

    public void clickS(View view) {
        imageReplacer.setImageResource(R.drawable.s);
    }

    public void clickT(View view) {
        imageReplacer.setImageResource(R.drawable.t);
    }

    public void clickU(View view) {
        imageReplacer.setImageResource(R.drawable.u);
    }

    public void clickV(View view) {
        imageReplacer.setImageResource(R.drawable.v);
    }

    public void clickW(View view) {
        imageReplacer.setImageResource(R.drawable.w);
    }

    public void clickX(View view) {
        imageReplacer.setImageResource(R.drawable.x);
    }

    public void clickY(View view) {
        imageReplacer.setImageResource(R.drawable.y);
    }

    public void clickZ(View view) {
        imageReplacer.setImageResource(R.drawable.z);
    }
}
