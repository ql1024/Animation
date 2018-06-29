package com.ql.animation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ql.animation.PropertyAnimation.ValueAnimator;
import com.ql.animation.R;

/**
 * Author: ql
 * Date: 2018/6/29
 * Desc: ValueAnimator
 */
public class ValueAnimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);

        TextView tv = findViewById(R.id.tv);

        ValueAnimator valueAnimator = new ValueAnimator();


        valueAnimator.ofInt_xml(this);
//        valueAnimator.ofInt_java(tv);
//        valueAnimator.ofFloat(tv);
    }
}