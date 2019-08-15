/**
 * 14 - 05 - 2019
 * 10116589
 * YUSUP MAULANA IBROHIM
 * IF13/ AKB13
 */
package com.yusup.bookfriend.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yusup.bookfriend.MainActivity;
import com.yusup.bookfriend.SharePreference.Preferences;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Preferences.getLoggedInStatus(this)){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }else {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }

        // langsung pindah ke MainActivity atau activity lain
        // begitu memasuki splash screen ini

    }
}
