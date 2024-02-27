package com.example.mycustmtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        //step 1
        setSupportActionBar(toolbar);

        //step 2
        // it will enable back button on left side\
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Praveen");
        }

        //step 3 Customize text
        // here title  not set bexcause its peiority is low than
        // alredy toolbar so we have right in if condition
        // toolbar.setTitle("Praveen");
        toolbar.setSubtitle("I'm Computer Science Student");


    }
    // set MEnu nevigatin
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //influate menu layout here
        new MenuInflater(this).inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    // click on listener on menu item
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // when click on any iten it will get that id
        int itemId = item.getItemId();
        if(itemId == R.id.setting)
        {
            Toast.makeText(this, "this is Setting", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.AboutUs) {
            Toast.makeText(this, "this is About us", Toast.LENGTH_SHORT).show();
        } else if (itemId == android.R.id.home) {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}