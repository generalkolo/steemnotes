package com.semanientreprise.steemnotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import com.semanientreprise.steemnotes.screens.account.activity.AccountActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class loggedIn extends AppCompatActivity {

    @BindView(R.id.btn_go)
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        ButterKnife.bind(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @OnClick(R.id.btn_go)
    public void onViewClicked() {
        startActivity(new Intent(loggedIn.this,AccountActivity.class));
    }
}
