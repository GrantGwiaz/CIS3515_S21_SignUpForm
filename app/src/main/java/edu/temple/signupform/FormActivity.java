package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean welcome = true;

                String name = ( (EditText) findViewById(R.id.editTextTextPersonName)).getText().toString();
                String email = ( (EditText) findViewById(R.id.editTextTextEmailAddress)).getText().toString();
                String password = ( (EditText) findViewById(R.id.editTextTextPassword)).getText().toString();
                String confirmPassword = ( (EditText) findViewById(R.id.editTextTextPassword2)).getText().toString();


                if(welcome)
                Toast.makeText(FormActivity.this, "Welcome, " + "" + ", to the SignUpForm App", Toast.LENGTH_SHORT).show();
            }
        });
    }
}