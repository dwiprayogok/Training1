package com.example.gue_pc.trainingnewandroid.Presenter;

import android.text.TextUtils;

import com.example.gue_pc.trainingnewandroid.Interface.LoginPresenter;
import com.example.gue_pc.trainingnewandroid.Interface.LoginView;

import org.w3c.dom.Text;

/**
 * Created by Gue-PC on 1/2/2018.
 */

public class LoginPresenterImp implements LoginPresenter {

    private LoginView loginView;

    public LoginPresenterImp(LoginView loginView){
        this.loginView = loginView;
    }

    @Override
    public void Login(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
            loginView.showError();
        }else {
            if (username.equals("admin")&& password.equals("admin")){
                loginView.loginSuccess();
            }else {
                loginView.loginError();
            }
        }
    }
}
