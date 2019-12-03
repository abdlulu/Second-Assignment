package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firsNameTv , lastNameTv , emailTv , passwordTv , phoneTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String firsName = getIntent().getExtras().getString("firstName");
        String lasName = getIntent().getExtras().getString("lastName");
        String email = getIntent().getExtras().getString("email");
        String password = getIntent().getExtras().getString("password");
        String phone = getIntent().getExtras().getString("phone");

        firsNameTv = findViewById(R.id.firstNameTv);
        firsNameTv.setText("First Name: "+firsName);

        lastNameTv = findViewById(R.id.lastNameTv);
        lastNameTv.setText("Last Name: "+lasName);

        emailTv = findViewById(R.id.emailTv);
        emailTv.setText("Email Address: "+email);

        passwordTv = findViewById(R.id.passwordTv);
        passwordTv.setText("Password: "+password);

        phoneTv = findViewById(R.id.phoneTv);
        phoneTv.setText("phone: "+phone);

    }
}
