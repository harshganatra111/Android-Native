package com.example.harsh.visitingcard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeCall(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:8861316160"));
        startActivity(intent);
    }
    public void visitWebsite(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.christuniversity.in"));
        startActivity(browserIntent);
    }
    public void mailMe(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","harsh@gpsprolab.in", null));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Demo Subject");
        intent.putExtra(Intent.EXTRA_TEXT, "Demo Message");
        startActivity(Intent.createChooser(intent, "Choose an Email client :"));
        }
    }