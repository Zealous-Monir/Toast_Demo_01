package com.example.toastdemo01;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn1, btn2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        textView = findViewById(R.id.textView);





    }

    public void showMassage(View v){

        if(v.getId() == R.id.btn1){
              // To see the action in logcat
 //           Log.d("tag","Login Button is clicked");
            Toast toast = Toast.makeText(MainActivity.this,"Login Button is clicked",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM,0,0);
           toast.show();
        }
        else  if(v.getId() == R.id.btn2){
            // To see the action in logcat
 //           Log.d("tag","Logout Button is clicked");

            Toast.makeText(MainActivity.this,"Logout Button is clicked",Toast.LENGTH_LONG).show();
        }


    }


}