package com.example.grocery_last;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.grocery_last.usersession.UserSession;
import com.kaopiz.kprogresshud.KProgressHUD;

import org.json.JSONException;
import org.json.JSONObject;


public class LoginActivity extends AppCompatActivity {

    private EditText edtemail,edtpass;
    private String email,pass,sessionmobile;
    private TextView appname,forgotpass,registernow;
    private UserSession session;
    public static final String TAG = "MyTag";
    private int cartcount, wishlistcount;

    //Getting reference to Firebase Database


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.e("Login CheckPoint","LoginActivity started");
        //check Internet Connection

//        Typeface typeface = ResourcesCompat.getFont(this, R.font.blacklist);
  //      appname = findViewById(R.id.appname);
    //    appname.setTypeface(typeface);

        edtemail= findViewById(R.id.email);
        edtpass= findViewById(R.id.password);

        Bundle registerinfo=getIntent().getExtras();
        if (registerinfo!=null) {
            edtemail.setText(registerinfo.getString("email"));
        }

        session= new UserSession(getApplicationContext());

        //if user wants to register
        registernow= findViewById(R.id.register_now);
        registernow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,Register.class));
                finish();
            }
        });

        //if user forgets password
        forgotpass=findViewById(R.id.forgot_pass);
        forgotpass.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //startActivity(new Intent(LoginActivity.this,ForgotPassword.class));
            }
        });


        //Validating login details
        Button button=findViewById(R.id.login_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                email=edtemail.getText().toString();
                pass=edtpass.getText().toString();

                if (validateUsername(email) && validatePassword(pass)) { //Username and Password Validation

                    //Progress Bar while connection establishes

                    Toast.makeText(LoginActivity.this, "dddddddddd", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }



    private boolean validatePassword(String pass) {


        if (pass.length() < 4 || pass.length() > 20) {
            edtpass.setError("Password Must consist of 4 to 20 characters");
            return false;
        }
        return true;
    }

    private boolean validateUsername(String email) {

        if (email.length() < 4 || email.length() > 30) {
            edtemail.setError("Email Must consist of 4 to 30 characters");
            return false;
        } else if (!email.matches("^[A-za-z0-9.@]+")) {
            edtemail.setError("Only . and @ characters allowed");
            return false;
        } else if (!email.contains("@") || !email.contains(".")) {
            edtemail.setError("Email must contain @ and .");
            return false;
        }
        return true;
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Login CheckPoint","LoginActivity resumed");
        //check Internet Connection

    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.e("Login CheckPoint","LoginActivity stopped");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}