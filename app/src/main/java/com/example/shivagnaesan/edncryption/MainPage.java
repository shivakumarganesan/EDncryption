package com.example.shivagnaesan.edncryption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends MainActivity {


    Button buttonsigin,buttonsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        buttonsigin=(Button)findViewById(R.id.button_in);
        buttonsignup=(Button)findViewById(R.id.button2_signup);

        click_Signin();
        click_Signup();

    }

    public void click_Signin()
    {
        buttonsigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent("com.example.shivagnaesan.edncryption.SIGNIN");
                startActivity(intent);
            }
        });
    }
    public void click_Signup()
    {
        buttonsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1= new Intent("com.example.shivagnaesan.edncryption.SIGNUP");
                startActivity(intent1);
            }
        });
    }

}
