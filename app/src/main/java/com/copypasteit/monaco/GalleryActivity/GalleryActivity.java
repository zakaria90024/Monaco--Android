package com.copypasteit.monaco.GalleryActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.copypasteit.monaco.HomeActivity.HomeActivity;
import com.copypasteit.monaco.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import java.lang.annotation.IncompleteAnnotationException;

public class GalleryActivity extends AppCompatActivity implements RewardedVideoAdListener {
    private RewardedVideoAd mRewardedVideoAd ;
    Toolbar mToolbar;
        private String[] imageUrls = new String[]{

                "https://apps.bncodeing.com/public/frontend/monako_slider/1676439477679408.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676439946690273.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676440645411418.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821281030557.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821808672552.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821786075897.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676440612795271.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676441154346454.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821382079922.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821357249069.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821323580000.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821311191103.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821295092073.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821281030557.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821808672552.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821786075897.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676821768268614.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676440612795271.jpg",
                "https://apps.bncodeing.com/public/frontend/monako_slider/1676441154346454.jpg"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        //apps pub id
        MobileAds.initialize(GalleryActivity.this, "ca-app-pub-3010341507881755~5432887019");
        mRewardedVideoAd  = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd .setRewardedVideoAdListener(this);
        loadRewardedVideoAd();


        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, imageUrls);
        viewPager.setAdapter(adapter);


    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();

        Intent intent = new Intent(GalleryActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
        mRewardedVideoAd.show();
    }

    //for video ads
    public void BackClick(View view) {
        Intent intent = new Intent(GalleryActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
    //user define method for loadRewardedVideoAd load ads=================
    //===================================================================
    private void loadRewardedVideoAd() {

        //ads unit id
        mRewardedVideoAd.loadAd("ca-app-pub-3010341507881755/4173638059",
                new AdRequest.Builder().build());
    }

    //copy threds method onResume, onPause, onDestroy=========
    //========================================================
    @Override
    public void onResume() {
        mRewardedVideoAd.resume(this);
        //interstitialAd.show();
        super.onResume();
    }

    @Override
    public void onPause() {
        mRewardedVideoAd.pause(this);
        super.onPause();
    }

    @Override
    public void onDestroy() {
        mRewardedVideoAd.destroy(this);
        super.onDestroy();
    }

    //implements methods ======================================
    //from RewardAdListener ===================================
}
