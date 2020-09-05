package com.copypasteit.monaco.ViewActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.copypasteit.monaco.HomeActivity.HomeActivity;
import com.copypasteit.monaco.R;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import org.sufficientlysecure.htmltextview.HtmlTextView;

public class ViewActivity extends AppCompatActivity {
    //STEP-1 for InterstitialAd=====================================
    public InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        //STEP - 2 Intertatial ads =======================================
        //add below 3 lines with rewordvideo ads
        interstitialAd = new InterstitialAd(this);
        //Interstitial ads unit add
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        loadInterstitialAd();

        //ENDSTEP - 2 Intertatial ads ====================================


        getDataFromIntent();
    }
    //STEP - 3 InterstitialAd load ads ===================================
    //====================================================================
    private void loadInterstitialAd() {
        //ads unit id
        interstitialAd.loadAd(new AdRequest.Builder().build());
    }
    //ENDSTEP - 3 InterstitialAd load ads =================================

    //STEP-4 for InterstitialAd=====================================
    @Override
    public void onBackPressed() {

        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
        }
        super.onBackPressed();
    }
    //ENDSTEP-4 for InterstitialAd=======================================

    @Override
    public void onResume() {
        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
        }
        super.onResume();
    }
    private void getDataFromIntent() {

        String dress_name = getIntent().getStringExtra("dress_name");
        String dress_model_no = getIntent().getStringExtra("dress_model_no");
        String dress_size = getIntent().getStringExtra("dress_size");
        String dress_image_url = getIntent().getStringExtra("dress_image_url");
        String dress_details = getIntent().getStringExtra("dress_details");

        setDataFromIntent(dress_name, dress_model_no, dress_size, dress_image_url, dress_details);

    }

    private void setDataFromIntent(String dress_name, String dress_model_no, String dress_size, String dress_image_url, String dress_details) {
        TextView postTitle  = findViewById(R.id.heder_text);
        postTitle.setText(dress_name);

        TextView postAuthor = findViewById(R.id.dress_modelId);
        postAuthor.setText(dress_model_no);

        HtmlTextView postDetails = (HtmlTextView)findViewById(R.id.html_text);
        postDetails.setHtml(dress_details);

        TextView PostCategory = findViewById(R.id.dress_sizeid);
        PostCategory.setText(dress_size);

        PhotoView dress_image = (PhotoView) findViewById(R.id.imageView);


//        post_image = findViewById(R.id.post_image);
//        post_category = findViewById(R.id.post_category);
//        post_date = findViewById(R.id.post_date);

        Glide
                .with(this)
                .load(dress_image_url)
                .override(320, 220)
                .centerCrop()
                .placeholder(R.drawable.ic_spinner)
                .into(dress_image);

    }



    public void BackClick(View view) {
        Intent intent = new Intent(ViewActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }


}
