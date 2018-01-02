package com.example.gue_pc.trainingnewandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gue_pc.trainingnewandroid.Interface.LoginPresenter;
import com.example.gue_pc.trainingnewandroid.Interface.LoginView;
import com.example.gue_pc.trainingnewandroid.Presenter.LoginPresenterImp;

public class MainActivity extends AppCompatActivity implements LoginView {

    EditText username2,password2;
    Button login;
    LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username2 = findViewById(R.id.edt_username);
        password2 = findViewById(R.id.edt_password);
        login = findViewById(R.id.btn_login);

        presenter = new LoginPresenterImp(this);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             presenter.Login(username2.getText().toString(),password2.getText().toString());
            }
        });
    }

    @Override
    public void showError() {
        Toast.makeText(getApplicationContext(),"ERRORE",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(getApplicationContext(),"Sucess",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(getApplicationContext(),"gagal login",Toast.LENGTH_SHORT).show();
    }
}
