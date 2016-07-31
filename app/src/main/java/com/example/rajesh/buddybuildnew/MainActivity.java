package com.example.rajesh.buddybuildnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_one= (TextView) findViewById(R.id.tv_one);
        tv_one.setText("");
        if(tv_one.getText().toString().equals("")){
            Toast.makeText(null,"d",Toast.LENGTH_SHORT).show();
        }
    }
}
