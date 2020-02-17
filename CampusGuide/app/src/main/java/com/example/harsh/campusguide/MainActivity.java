package com.example.harsh.campusguide;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        list = new  ArrayList<String>();
        list.add("Block 1");
        list.add("Block 2");
        list.add("Block 3");
//        list.add("Block 4");
//        list.add("Block 5");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getBaseContext(),"Position " + (position+1) + " Clicked" , Toast.LENGTH_SHORT).show();
                //  Intent i = new Intent(MainActivity.this,DetailScreen.class);
                //i.putExtra("position",position);
                //     i.putExtra("block", list);
                // startActivity(i);
                // 1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                if (position == 0) {
                    builder.setMessage("Block 1 is Administration Block")
                            .setTitle("BLOCK ONE");

                }
                else if(position == 1){
                    builder.setMessage("Block 1 is CSE & ECE Block")
                            .setTitle("BLOCK TWO");

                }
                else if(position ==2){
                    builder.setMessage("Block 1 is First  year, CI , EEE Block")
                            .setTitle("BLOCK THREE");
                }
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
