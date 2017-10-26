package com.rodrigo_tamay_moo.imcapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.frament_container);
        if(fragment == null){
            fragment = new ImcFragment();
            fm.beginTransaction()
                    .add(R.id.frament_container, fragment)
                    .commit();
        }
    }
}
