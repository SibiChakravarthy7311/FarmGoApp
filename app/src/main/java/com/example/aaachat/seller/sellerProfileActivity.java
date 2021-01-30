package com.example.aaachat.seller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aaachat.R;

public class sellerProfileActivity extends AppCompatActivity {

    private ImageView edit_desc;
    private ImageView edit_name;
    private ImageView edit_address;
    private ImageView save_desc;
    private ImageView save_name;
    private ImageView save_address;
    private TextView profile_desc;
    private TextView profile_name;
    private TextView profile_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_profile);

        edit_desc = (ImageView)findViewById(R.id.edit_desc);
        edit_name = (ImageView)findViewById(R.id.edit_name);
        edit_address = (ImageView)findViewById(R.id.edit_address);
        save_desc = (ImageView)findViewById(R.id.save_desc);
        save_name = (ImageView)findViewById(R.id.save_name);
        save_address = (ImageView)findViewById(R.id.save_address);
        profile_desc = (TextView) findViewById(R.id.profile_desc);
        profile_name = (TextView) findViewById(R.id.profile_name);
        profile_address = (TextView) findViewById(R.id.profile_address);

    }

    
}