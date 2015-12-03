package com.example.guest.awardscardholder.model.ui.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.guest.awardscardholder.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.welcomeText) TextView mWelcomeText;
    @Bind(R.id.signInText) TextView mSignInText;
    @Bind(R.id.signInbutton) Button mSignInButton;
    @Bind(R.id.emailText) TextView mEmailText;
    @Bind(R.id.passwordText) TextView mPaswordText;
    @Bind(R.id.signUpButton) Button mSignUpButton;
    @Bind(R.id.newAwardsHolderText) TextView mNewAwardsHolderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mSignInButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String email = mEmailText.getText().toString();
                String password = mPaswordText.getText().toString();
                signIn(email, password);
            }
        });
    }

    public void signIn(String email, String password) {
        Intent intent = new Intent(this, CategoryActivity.class);
        intent.putExtra("email", email);
        intent.putExtra("password", password);
        startActivity(intent);
    }

}
