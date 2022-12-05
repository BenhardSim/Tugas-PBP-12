package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah(View view) {
        switch(view.getId()){
            case R.id.add_mhs:
                Intent moveAdd = new Intent(MainActivity.this, TambahMhsActivity.class);
                startActivity(moveAdd);
                break;
            case R.id.list_mhs:
                Intent moveList = new Intent(MainActivity.this, ListMhsActivity.class);
                startActivity(moveList);
                break;
        }
    }
}