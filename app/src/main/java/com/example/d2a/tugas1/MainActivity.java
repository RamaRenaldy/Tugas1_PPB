package com.example.d2a.tugas1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openurl(View view) {
        Uri uri = Uri.parse("http://www.google.com");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }

    public void callnumber(View view) {
        Uri uri = Uri.parse("tel:0895386866969");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    public void showmap(View view) {
        Uri uri = Uri.parse("geo:0,0?q=-6.972589, 110.437386");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

}


