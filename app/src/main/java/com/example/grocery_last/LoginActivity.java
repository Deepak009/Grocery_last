package com.example.grocery_last;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.example.grocery_last.usersession.UserSession;

public class LoginActivity extends AppCompatActivity {
    private EditText edtemail,edtpass;
    private String email,pass,sessionmobile;
    private TextView appname,forgotpass,registernow;
   // private RequestQueue requestQueue;
    private UserSession session;
    public static final String TAG = "MyTag";
    private int cartcount, wishlistcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.e("Login CheckPoint","LoginActivity started");
    }
}
