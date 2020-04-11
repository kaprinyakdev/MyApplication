package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends Activity {

    private int SLEEP_TIMER = 3;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash_screen);
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();

    }

    private class LogoLauncher extends Thread{
        public void run(){
            try{
                sleep(1000 * SLEEP_TIMER);
            }catch (InterruptedException e) {
                e.printStackTrace();
                }

            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(intent);
            SplashScreen.this.finish();
            }
        }
}