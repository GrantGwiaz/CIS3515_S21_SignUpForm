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
                // reset errors to invisible upon pressing save
                findViewById(R.id.TextViewPasswordConfirmErr).setAlpha(0);
                findViewById(R.id.TextViewPasswordErr).setAlpha(0);
                findViewById(R.id.TextViewEmailErr).setAlpha(0);
                findViewById(R.id.TextViewNameErr).setAlpha(0);

                //get all the views that had data entered by user
                EditText nameText = (EditText) findViewById(R.id.editTextTextPersonName);
                EditText emailText = (EditText) findViewById(R.id.editTextTextEmailAddress);
                EditText passwordText = (EditText) findViewById(R.id.editTextTextPassword);
                EditText confirmPasswordText = (EditText) findViewById(R.id.editTextTextPassword2);

                // the actual strings of data entered
                String name = nameText.getText().toString();
                String email = emailText.getText().toString();
                String password = passwordText.getText().toString();
                String confirmPassword = confirmPasswordText.getText().toString();

                boolean welcome = true;

                if(name.contentEquals("")) {
                    findViewById(R.id.TextViewNameErr).setAlpha(100);
                    welcome = false;
                }
                if(email.contentEquals("")) {
                    findViewById(R.id.TextViewEmailErr).setAlpha(100);
                    welcome = false;
                }
                if(password.contentEquals("")) {
                    findViewById(R.id.TextViewPasswordErr).setAlpha(100);
                    welcome = false;
                }
                if(!password.contentEquals(confirmPassword)) {
                    findViewById(R.id.TextViewPasswordConfirmErr).setAlpha(100);
                    welcome = false;
                }
                if(welcome) {
                    Toast.makeText(FormActivity.this, "Welcome, " + name + ", to the SignUpForm App", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}