package com.example.hxhair.surveyq;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Survey extends AppCompatActivity {
    String QTittle="Who am I";
    String[] Qoptions={"Pikachu","Blastoise","Charizard"};
    int QNum=-1;
    //int QNum=1;

    CheckBox[] cbList;
    TextView tv;
    Button nBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        // get the survey layout
        ConstraintLayout SurLayout = (ConstraintLayout)findViewById(R.id.surveyLayout);

        //The Question titile
        tv=(TextView)findViewById(R.id.textView1);
        tv.setText(QTittle);

        //the options CheckBoxs
        cbList=new CheckBox[Qoptions.length];

        //the nextQuestion Button
        nBtn=(Button)findViewById(R.id.NextBtn);
        if(QNum==-1)
            nBtn.setText("Complete");


        //add the options to the view
        for(int i =0 ; i <Qoptions.length;i++)
        {
            cbList[i]=new CheckBox(this);
            cbList[i].setText(Qoptions[i]);
            //set the position of each options
            ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) tv.getLayoutParams();
            ConstraintLayout.LayoutParams newParams = new ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT);
            newParams.leftToLeft=params.leftToLeft;
            newParams.rightToRight=params.rightToRight;
            newParams.topToTop=params.topToTop;
            newParams.bottomToBottom=params.bottomToBottom;
            newParams.horizontalBias=0.3f;
            newParams.verticalBias=(float)(0.4+0.1*i);//to seperate each options position
            newParams.bottomMargin=8;
            newParams.topMargin=8;
            newParams.leftMargin=8;
            newParams.rightMargin=8;

            SurLayout.addView(cbList[i],newParams);//add to the View

        }

    }


    public String[] nextQuestionClick(View view)
    {
        ArrayList<String> returnList=new ArrayList<String>();
        //String[] returnList={};
        for(int i=0;i<cbList.length;i++)
        {
            if(cbList[i].isChecked())
                returnList.add(cbList[i].getText().toString());

        }
        return (String[])returnList.toArray();
    }
}
