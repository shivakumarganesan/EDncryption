package com.example.shivagnaesan.edncryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    EditText editTextusername,editTextpassword;
    Button butsingin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        loginButton();
    }

    public void loginButton()
    {
        editTextusername=(EditText)findViewById(R.id.editText_username);
        editTextpassword=(EditText)findViewById(R.id.editText2_password);

        butsingin=(Button)findViewById(R.id.signin);

        butsingin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editTextusername.getText().toString().equals("user")&& editTextpassword.getText().toString().equals("pass"))
                {
                    Toast.makeText(SignIn.this,"LOGIN SUCCESSFULL",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(SignIn.this,"LOGIN UNSUCCESSFULL",Toast.LENGTH_LONG).show();
                }


            }
        });


    }
}