package com.example.grocery_last;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Notifications(View view) {
        startActivity(new Intent(MainActivity.this, NotificationActivity.class));
    }

    public void cardsActivity(View view) {
        startActivity(new Intent(MainActivity.this, Cards.class));
    }

    public void tshirtActivity(View view) {
        startActivity(new Intent(MainActivity.this, Tshirts.class));
    }


    public void bagsActivity(View view) {

        startActivity(new Intent(MainActivity.this, Bags.class));
    }

    public void stationaryAcitivity(View view) {

        startActivity(new Intent(MainActivity.this, Stationary.class));
    }

    public void calendarsActivity(View view) {

        startActivity(new Intent(MainActivity.this, CalendarContract.Calendars.class));
    }

    public void keychainsActivity(View view) {

        startActivity(new Intent(MainActivity.this, Keychains.class));
    }
    public void viewProfile(View view) {
        startActivity(new Intent(MainActivity.this, Profile.class));
    }

    public void viewCart(View view) {
        startActivity(new Intent(MainActivity.this, Cart.class));
    }
}
