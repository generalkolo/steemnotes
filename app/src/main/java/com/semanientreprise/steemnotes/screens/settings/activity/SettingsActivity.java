package com.semanientreprise.steemnotes.screens.settings.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.semanientreprise.steemnotes.R;
import com.semanientreprise.steemnotes.app_core.view.AppCoreActivity;

public class SettingsActivity extends AppCoreActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
}
