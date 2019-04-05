package com.example.android_nisban.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShow(View view) {
        TextView tvMsgDisplay = findViewById(R.id.tv_msg);
        EditText edtMsg = findViewById(R.id.edt_msg);
        String msg = edtMsg.getText().toString();
        tvMsgDisplay.setText(msg);
    }
}
