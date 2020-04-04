package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 =findViewById(R.id.l1);


    }
    public void onSet(View view){
        Intent intent = new Intent(this, Activity_1.class);
        startActivity(intent);
    }
    public void onSet_1(View view){
        Intent intent = new Intent(this, Activity_2.class);
        startActivity(intent);
    }    public void onSet_2(View view){
        Intent intent = new Intent(this, Activity_3.class);
        startActivity(intent);
    }    public void onSet_3(View view){
        Intent intent = new Intent(this, Activity_4.class);
        startActivity(intent);
    }
    public void onSet_4(View view){
        Intent intent = new Intent(this, Activity_5.class);
        startActivity(intent);
    }
    public void onSet_5(View view){
        Intent intent = new Intent(this, Activity_6.class);
        startActivity(intent);
    }

}
