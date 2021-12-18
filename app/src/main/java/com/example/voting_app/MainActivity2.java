package com.example.voting;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class Output extends MainActivity {
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.output);
        ansName = findViewById(R.id.ansName);
        ansage = findViewById(R.id.ansAge);
        ansAdhar = findViewById(R.id.ansAdhar);
        String Name =getIntent().getStringExtra("keyName");
        String adhar =getIntent().getStringExtra("keyAdhar");
        String age =getIntent().getStringExtra("keyAge");
        ansName.setText(Name);
        ansAdhar.setText(adhar);
        ansage.setText(age);
    }
}
