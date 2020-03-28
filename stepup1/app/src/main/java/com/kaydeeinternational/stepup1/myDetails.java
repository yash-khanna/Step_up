package com.kaydeeinternational.stepup1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class myDetails extends AppCompatActivity {

    public void coin(View view){
        Button coin=(Button)findViewById(R.id.b2);
        Log.i("Button was","tapped");
        Intent intent=new Intent(getApplicationContext(),coins.class);
        startActivity(intent);
    }

    public void market(View view){
        Button market=(Button)findViewById(R.id.b3);
        Log.i("Button was","tapped");
        Intent intent=new Intent(getApplicationContext(),market.class);
        startActivity(intent);
    }

    public void main1(View view){
        Button main12=(Button)findViewById(R.id.b1);
        Log.i("Button was","tapped");
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_details);
    }
}
