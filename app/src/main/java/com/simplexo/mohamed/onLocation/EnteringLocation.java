package com.simplexo.mohamed.onLocation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EnteringLocation extends AppCompatActivity {
  //  private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entering_location);
        Intent startIntent = new Intent(this, RingtonePlayingService.class);


        //startService(startIntent);
        startService(startIntent);

      /*  MobileAds.initialize(this, getString(R.string.admob_app_id));
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1640388995037866/7211377359");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });*/
    //--------------------------------------------------------------------------------------------------------------
     /*  Intent startIntent = new Intent(this, RingtonePlayingService.class);


        //startService(startIntent);
         startService(startIntent);*/
     //--------------------------------------------------------------------------------------------
      //  Button CloseRing = findViewById(R.id.CloseRing);
       // startRingtone();
        /*  CloseRing.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
             // stopRingtone();
                // r.stop();
                Intent stopIntent = new Intent(this, RingtonePlayingService.class);
                stopService(stopIntent);

            }*/
        //});


    }
   /* public void displayInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }*/
    public void CloseRing(View view) {

        Intent stopIntent = new Intent(this, RingtonePlayingService.class);
        stopService(stopIntent);
      //  displayInterstitial();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
      //  displayInterstitial();


    }

 /* public  void startRingtone () {
      Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
      Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), notification);
      r.play();
      Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

      long[] pattern = {0, 300, 1000, 300, 200, 300, 500, 200, 100, 300, 1000, 300, 200, 300, 500, 200, 100};
      //
      // The '-1' here means to vibrate once, as '-1' is out of bounds in the pattern array
      v.vibrate(pattern, -1);

  }

    public void stopRingtone  ()
    {

       this. r.stop();

    }*/

}
