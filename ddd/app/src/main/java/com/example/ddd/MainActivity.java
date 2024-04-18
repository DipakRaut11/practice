package com.example.ddd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btnnav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnav = findViewById(R.id.btmNav);

        btnnav.setSelectedItemId(R.id.second);
        btnnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.first){
                    fragment(new BlankFragment(), false);
                } else if (id == R.id.second) {
                    fragment(new BlankFragment2(), false);
                }
                else{
                    fragment(new BlankFragment3(), true);

                }

                return true;
            }
        });

    }
    public void fragment(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        
        if (flag ){
            ft.add(R.id.container, fragment);
        }
        else {
            ft.replace(R.id.container, fragment);
        }
        ft.commit();


    }

}