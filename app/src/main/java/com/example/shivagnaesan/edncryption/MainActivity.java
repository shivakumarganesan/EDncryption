package com.example.shivagnaesan.edncryption;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button let;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        let=(Button)findViewById(R.id.button_lets);
        OnClickButtonListener();

    }

    public void  OnClickButtonListener()
    {
        let.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent("com.example.shivagnaesan.edncryption.MAINPAGE");
                startActivity(intent);
            }
        });
    }
}
