package com.semanientreprise.steemnotes;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initRealm();
    }

    private void initRealm () {
        Realm.init (this);

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder ()
                .name ("GokadaRealm")
                .deleteRealmIfMigrationNeeded ()
                .schemaVersion (1)
                .build ();

        Realm.setDefaultConfiguration (realmConfiguration);
    }
}
