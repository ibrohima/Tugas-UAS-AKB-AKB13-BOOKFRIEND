/**
 * 13 - 05 - 2019
 * 10116589
 * YUSUP MAULANA IBROHIM
 * IF13/ AKB13
 */
package com.yusup.bookfriend.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.yusup.bookfriend.MainActivity;
import com.yusup.bookfriend.R;
import com.yusup.bookfriend.SharePreference.Preferences;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnSignin, btnDaftar;
    EditText eusername, epassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignin = findViewById(R.id.btnSignin);
        btnSignin.setOnClickListener(this);
        btnDaftar = findViewById(R.id.btnDaftar);
        btnDaftar.setOnClickListener(this);
        eusername=findViewById(R.id.usernameLogin);
        epassword=findViewById(R.id.passwordLogin);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSignin:
               String username, password;
                username = eusername.getText().toString();
                password = epassword.getText().toString();

                if (username.equals("")) {
                    eusername.setError("Kolom Username tidak boleh dikosongkan");
                }else if(password.equals("")) {
                    epassword.setError("Kolom password tidak boleh dikosongkan");
                }else {
                    if (chekusername(username) && chekpassword(password)) {
                        Preferences.setLoggedInStatus(this, true);
                        Intent login = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(login);
                    }else {
                        Toast.makeText(this,"Login gagal, username dan password tidak sesuai",Toast.LENGTH_SHORT).show();
                    }
                }
            break;
            case R.id.btnDaftar:
                Intent intent1 = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent1);
                break;
        }

    }
    private boolean chekusername(String username) {
        return username.equals(Preferences.getRegisteredUser(this));
    }
    private boolean chekpassword(String password){
        return password.equals(Preferences.getRegisteredPass(this));

    }
}
