package com.iteso.pdm18_scrollabletabs;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLogin extends AppCompatActivity {

    private EditText user;
    private  EditText pass;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.activity_login_usernamae);
        pass = findViewById(R.id.activity_login_pass);
        login = findViewById(R.id.activity_login_login_sig_in);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveSharedPreferences();
                Intent intent = new Intent(ActivityLogin.this, ActivityMain.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void saveSharedPreferences() {
        SharedPreferences sharedPreferences = getSharedPreferences(
                ActivitySplashScreen.MYPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit(); //comienzo a editar
        editor.putString("NAME", user.getText().toString());
        editor.putString("PWD", pass.getText().toString());
        editor.putBoolean("LOGGER", true);
        editor.apply();
    }
}

