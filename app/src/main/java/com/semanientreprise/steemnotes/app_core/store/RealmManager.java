package com.semanientreprise.steemnotes.app_core.store;

import javax.inject.Inject;

import io.realm.Realm;

public class RealmManager {

    private Realm realm;

    @Inject
    public RealmManager(Realm realm){
        this.realm = realm;
    }

}
