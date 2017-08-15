package com.example.tomix.heden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity {

    private final String password = "h3den";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        Button submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText passwordEditText = (EditText) findViewById(R.id.accessCodeEditText);

                if (passwordEditText.getText().toString().equals(password)){

                    Intent intent = new Intent(LoginScreen.this, activity.MainActivity.class);
                    startActivity(intent);
                    finish();

                };
            }
        });
    }
}
