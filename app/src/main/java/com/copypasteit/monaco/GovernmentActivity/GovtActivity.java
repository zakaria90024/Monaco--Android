package com.copypasteit.monaco.GovernmentActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import com.copypasteit.monaco.HomeActivity.HomeActivity;
import com.copypasteit.monaco.MainActivity.MainActivity;
import com.copypasteit.monaco.R;

public class GovtActivity extends AppCompatActivity {
    Toolbar mToolbar;

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(GovtActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_govt);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

    }
}
