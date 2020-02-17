package com.example.harsh.campusguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailScreen extends AppCompatActivity {
    int position;
    ArrayList<String> list;
    ImageView blockImageView;
    TextView blockName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);
        Intent intentThatStartedThisActivity = getIntent();
        position = intentThatStartedThisActivity.getIntExtra("position" ,0 );
        list = intentThatStartedThisActivity.getStringArrayListExtra("block");
        blockImageView = findViewById(R.id.building_image_image_view);
        blockName = findViewById(R.id.block_name_text_view);
        blockImageView.setImageResource(R.drawable.ic_block_one);
        if(position==0){
            blockImageView.setImageResource(R.drawable.ic_block_one);
            blockName.setText("This is block 2");
        }
        else if(position==1){
            blockImageView.setImageResource(R.drawable.ic_block_two);
            blockName.setText("This is block 2");
        }
        else if(position==2){
            blockImageView.setImageResource(R.drawable.ic_block_three);
            blockName.setText("This is block 2");
        }
    }
}
