package com.example.guest.awardscardholder.model.ui.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.guest.awardscardholder.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.welcomeText) TextView welcomeText;
    @Bind(R.id.signInText) TextView signInText;
    @Bind(R.id.signInbutton) TextView signInButton;
    @Bind(R.id.emailText) TextView emailText;
    @Bind(R.id.passwordText) TextView paswordText;
    @Bind(R.id.signUpButton) TextView signUpButton;
    @Bind(R.id.newAwardsHolderText) TextView newAwardsHolderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    public void signIn(String email, String password) {
        Intent intent = new Intent(this, CategoryActivity.class);
        intent.putExtra(getString(R.string.key_name), email);
        intent.putExtra(getString(R.string), password);

    }

}
