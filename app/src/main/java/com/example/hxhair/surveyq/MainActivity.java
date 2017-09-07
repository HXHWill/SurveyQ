package com.example.hxhair.surveyq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1;
    CheckBox cb2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1=(CheckBox)findViewById(R.id.checkBox1);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        tv=(TextView)findViewById(R.id.textView);

    }
    public void testButtonClike(View view)
    {
        Intent intent=new Intent(MainActivity.this,Survey.class);
        startActivity(intent);
//        if(cb1.isChecked())
//            tv.setText(cb1.getText().toString());
//        else if(cb2.isChecked())
//            tv.setText(cb2.getText().toString());

    }

}
