package com.example.android.firstfragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String FRAGMENT_TAG = "fragment_tag";

    //private SimpleFragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SimpleFragment fragment = new SimpleFragment();

    }

    public void addclickHandler(View view) {
        SimpleFragment fragment = new SimpleFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.fragment_container,fragment,FRAGMENT_TAG)
                .commit();
    }

    public void removeClickHandler(View view){
        Fragment fragment =
                getSupportFragmentManager()
                        .findFragmentByTag(FRAGMENT_TAG);
                //.findFragmentById(R.id.fragment_container);
        if(fragment !=null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }
}
