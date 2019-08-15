/**
 * 14 - 05 - 2019
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

import com.yusup.bookfriend.R;
import com.yusup.bookfriend.SharePreference.Preferences;

import java.lang.ref.Reference;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnPendaftar, btnLogin;
    EditText eusername, epassword, ekpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnPendaftar = findViewById(R.id.btnPendaftar);
        btnPendaftar.setOnClickListener(this);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        eusername = findViewById(R.id.username);
        epassword = findViewById(R.id.password);
        ekpassword = findViewById(R.id.kpassword);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPendaftar:
                String username, password, kpassword;
                username = eusername.getText().toString();
                password = epassword.getText().toString();
                kpassword = ekpassword.getText().toString();
                if (username.equals("")) {
                    eusername.setError("Kolom Username tidak boleh dikosongkan");
                }else if(password.equals("")){
                    epassword.setError("Kolom password tidak boleh dikosongkan");
                }else if(kpassword.equals("")){
                    ekpassword.setError("Kolom konfirmasi password tidak boleh dikosongkan");
                }else if (! password.equals(kpassword)){
                    ekpassword.setError("password tidak sama");

                }else {
                    try {
                        Preferences.setRegisteredUser(this,username);
                        Preferences.setRegisteredPass(this,password);
                        Toast.makeText(this,"Registrasi berhasil",Toast.LENGTH_SHORT).show();

                        Intent login = new Intent( RegisterActivity.this, LoginActivity.class);
                        startActivity(login);
                    }catch (Exception E){
                        Toast.makeText(this,"Registrasi gagal",Toast.LENGTH_SHORT).show();
                    }

                }
                break;
            case R.id.btnLogin:
                Intent intent1 = new Intent( RegisterActivity.this, LoginActivity.class);
                startActivity(intent1);
                break;
        }

    }
}
