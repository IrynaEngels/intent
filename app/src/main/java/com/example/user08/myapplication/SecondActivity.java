package com.example.user08.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv;
    private Button resend;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = (TextView)findViewById(R.id.textView2);
        resend = (Button)findViewById(R.id.resend);
        Intent intent = getIntent();
        str = intent.getStringExtra(Const.DATE);
        tv.setText(str);
        resend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Date date = convertToDate(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        date = calendar.getTime();

    }

    private Date convertToDate(String dateString){
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");
    Date convertedDate = new Date();
    try {
        convertedDate = dateFormat.parse(dateString);
    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return convertedDate;
}
}
