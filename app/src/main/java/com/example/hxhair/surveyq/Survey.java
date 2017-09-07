package com.example.hxhair.surveyq;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.TextView;

public class Survey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        // get the survey layout
        ConstraintLayout SurLayout = (ConstraintLayout)findViewById(R.id.surveyLayout);
        TextView tv=(TextView)findViewById(R.id.textView1);
        // 将TextView 加入到LinearLayout 中
        CheckBox cbt1=new CheckBox(this);
        cbt1.setText("Option1");

        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) tv.getLayoutParams();
        ConstraintLayout.LayoutParams newParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //newParams.leftToLeft =  params.leftToLeft;
        //newParams.topToTop = params.topToTop+20;
        newParams.leftMargin = 8;
        newParams.topMargin = 8;
        newParams.rightMargin=8;
        newParams.bottomMargin = 8;
        newParams.leftToLeft=8;
        newParams.rightToRight=8;
        newParams.topToTop=8;

        SurLayout.addView(cbt1, newParams);

        //SurLayout.addView(cbt1,-1);
    }
}
