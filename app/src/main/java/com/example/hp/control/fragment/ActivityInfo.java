package com.example.hp.control.fragment;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.hp.control.R;


public class ActivityInfo extends AppCompatActivity implements View.OnClickListener{

    Button bInfoAll, bInfoIn, bInfoOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        bInfoAll = (Button) findViewById(R.id.bInfoAll);
        bInfoAll.setOnClickListener(this);
        bInfoIn = (Button) findViewById(R.id.bInfoIn);
        bInfoIn.setOnClickListener(this);
        bInfoOut = (Button) findViewById(R.id.bInfoOut);
        bInfoOut.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bInfoAll:
                Intent intent1 = new Intent(this, ActivityInfoAll.class);
                startActivity(intent1);
                break;
            case R.id.bInfoIn:
                Intent intent2 = new Intent(this, ActivityInfoIn.class);
                startActivity(intent2);
                break;
            case R.id.bInfoOut:
                Intent intent3 = new Intent(this, ActivityInfoOut.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}
