package com.saikiran.pillnotifymedsproject2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;

public class Names extends Activity {
	MediaPlayer ourSong;

	@Override
	protected void onCreate(Bundle SaiFirstApp) {
		// TODO Auto-generated method stub
		super.onCreate(SaiFirstApp);
		setContentView(R.layout.names_activity);
		ourSong = MediaPlayer.create(Names.this, R.raw.music);
		ourSong.start();
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(10000);

				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent openStartingPoint = new Intent(
							"com.saikiran.pillnotifymedsproject2.MainActivity");
					startActivity(openStartingPoint);

				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}

}
