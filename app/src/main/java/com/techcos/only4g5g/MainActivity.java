package com.techcos.only4g5g;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.Btn1);
        btn2=findViewById(R.id.Btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.setClassName("com.android.settings", "com.android.settings.RadioInfo");
                    startActivity(intent);
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "This method is Not Applicable for Your Android Version", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent=new Intent(Intent.ACTION_MAIN);
                    intent.setClassName("com.android.phone", "com.android.phone.settings.RadioInfo");
                    startActivity(intent);
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "This method is Not Applicable for Your Android Version", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}