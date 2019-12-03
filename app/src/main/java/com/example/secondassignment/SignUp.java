package com.example.secondassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class SignUp extends AppCompatActivity {

    EditText emailEdit ,passwordEdit ,passwordConfirmEdit ,firstNameEdit ,lastNameEdit ,phoneEdit;
    Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        emailEdit = findViewById(R.id.emailEdit);
        passwordEdit = findViewById(R.id.passwordEdit);
        passwordConfirmEdit = findViewById(R.id.passwordConfirmEdit);
        firstNameEdit = findViewById(R.id.firstNameEdit);
        lastNameEdit = findViewById(R.id.lastNameEdit);
        phoneEdit = findViewById(R.id.phoneEdit);
        signUpBtn = findViewById(R.id.signUpBtn);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email  = emailEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                String passwordConfirm = passwordConfirmEdit.getText().toString();
                String firstName = firstNameEdit.getText().toString();
                String lasName = lastNameEdit.getText().toString();
                String phone = phoneEdit.getText().toString();

                if(email.equals("")){
                    emailEdit.setError("Please Enter Your Email Address");
                    return;
                }

                if(password.equals("")){
                    passwordEdit.setError("Please Enter Your Password");
                    return;
                }

                if(passwordConfirm.equals("")){
                    passwordConfirmEdit.setError("Please Confirm Your Password");
                    return;
                }

                if(!passwordConfirm.equals(password)){
                    passwordConfirmEdit.setError("Passwords do not match");
                    return;
                }

                if(firstName.equals("")){
                    firstNameEdit.setError("Please Enter Your First Name");
                    return;
                }

                if(lasName.equals("")){
                    lastNameEdit.setError("Please Enter Your Last Name");
                    return;
                }

                if(phone.equals("")){
                    lastNameEdit.setError("Please Enter Your Phone Number");
                    return;
                }



                Intent intent = new Intent(SignUp.this , MainActivity.class);
                Bundle extras = new Bundle();
                extras.putString("firstName" ,firstName);
                extras.putString("lastName" ,lasName);
                extras.putString("email" ,email);
                extras.putString("password" ,password);
                extras.putString("phone" ,phone);
                intent.putExtras(extras);
                startActivity(intent);

            }
        });
    }
}
