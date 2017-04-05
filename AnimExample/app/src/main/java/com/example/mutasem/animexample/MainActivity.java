package com.example.mutasem.animexample;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView im;
    final int duration=2000;
    private Animator.AnimatorListener listener = new Animator.AnimatorListener() {

        @Override
        public void onAnimationStart(Animator animator) {

        }

        @Override
        public void onAnimationEnd(Animator animator) {
            im.setY(20);
            im.setX(20);
            im.setRotation(0);
            im.setScaleX(1);
            im.setScaleY(1);
            im.setAlpha(1f);
        }

        @Override
        public void onAnimationCancel(Animator animator) {

        }

        @Override
        public void onAnimationRepeat(Animator animator) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im = (ImageView) findViewById(R.id.cartIV);
        im.setY(20);
        im.setX(20);
    }

    public void runScale(View view) {
        im.animate()
                .scaleX(2f)
                .scaleY(2f)
                .setDuration(duration)
                .setListener(listener)
                .start();

    }

    public void runTranslate(View view) {
        im.animate()
                .translationX(500)
                .translationY(500)
                .setDuration(duration)
                .setListener(listener)
                .start();

    }

    public void runTotate(View view) {
        im.animate()
                .rotation(180)
                .setDuration(duration)
                .setListener(listener)
                .start();
    }
    public void  runFade(View view){
        im.animate()
                .alpha(0.2f)
                .setDuration(duration)
                .setListener(listener)
                .start();

    }
}
