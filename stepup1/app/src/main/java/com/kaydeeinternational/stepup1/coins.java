package com.kaydeeinternational.stepup1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class coins extends AppCompatActivity {

    public void my_details(View view){
        Button my_details=(Button)findViewById(R.id.b4);
        Log.i("Button was","tapped");
        Intent intent=new Intent(getApplicationContext(),myDetails.class);
        startActivity(intent);
    }

    public void main1(View view){
        Button main12=(Button)findViewById(R.id.b1);
        Log.i("Button was tapped","message");
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
    public void market(View view){
        Button market=(Button)findViewById(R.id.b3);
        Log.i("Button was","tapped");
        Intent intent=new Intent(getApplicationContext(),market.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coins);
    }
}
