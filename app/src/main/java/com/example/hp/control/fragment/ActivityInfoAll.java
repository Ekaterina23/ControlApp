package com.example.hp.control.fragment;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.hp.control.R;
import com.example.hp.control.service.ControlRest;


public class ActivityInfoAll extends AppCompatActivity {

    private TextView id, title, remindDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_info_all);
        id = (TextView) findViewById(R.id.id);
        title = (TextView) findViewById(R.id.title);
        remindDate = (TextView) findViewById(R.id.remindDate);
        ControlRest.getService();

    }


}
