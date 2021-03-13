package com.example.reallyannoyingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.reallyannoyingapp.navigation_bar.Exit;
import com.example.reallyannoyingapp.navigation_bar.Phone;
import com.example.reallyannoyingapp.navigation_bar.contactUs;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
private BottomNavigationView myNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.screen_to_show,new Phone()).commit();
        myNav = findViewById(R.id.bottom_nav);
        myNav.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){

                case R.id.Phone:
                    getSupportFragmentManager().beginTransaction().replace(R.id.screen_to_show,new Phone()).commit();
                    break;

                case R.id.contact_us:
                    getSupportFragmentManager().beginTransaction().replace(R.id.screen_to_show,new contactUs()).commit();
                    break;
                case R.id.Exit:
                    getSupportFragmentManager().beginTransaction().replace(R.id.screen_to_show,new Exit()).commit();
                    break;

            }
            return false;
        });
    }

}
