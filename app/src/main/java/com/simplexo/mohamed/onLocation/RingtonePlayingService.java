package com.simplexo.mohamed.onLocation;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.Vibrator;

public class RingtonePlayingService extends Service {
    public RingtonePlayingService() {
    }

   public Ringtone ringtone;


    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        try {
            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
            ringtone = RingtoneManager.getRingtone(getApplicationContext(), notification);
            if (ringtone != null) {
            //   ringtone.stop();
                ringtone.play();
            }
            Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

            long[] pattern = {0, 300, 1000, 300, 200, 300, 500, 200, 100, 300, 1000, 300, 200, 300, 500, 200, 100};
            //
            // The '-1' here means to vibrate once, as '-1' is out of bounds in the pattern array
            v.vibrate(pattern, -1);
        }
        catch (Exception e) {
            e.printStackTrace();


        }

      /*  Uri ringtoneUri = Uri.parse(intent.getExtras().getString("ringtone-uri"));

        this.ringtone = RingtoneManager.getRingtone(this, ringtoneUri);
        ringtone.play();*/

        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy()
    {

        ringtone.stop();

    }
}