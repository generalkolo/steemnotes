package com.semanientreprise.steemnotes.app_core.dagger.modules.store;

import android.content.Context;

import com.semanientreprise.steemnotes.app_core.dagger.modules.external.ContextModule;
import com.semanientreprise.steemnotes.app_core.dagger.scopes.MainScope;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;

@Module(includes = {ContextModule.class})
public class RealmModule {

    @MainScope
    @Provides
    public Realm provideRealm(Context context, RealmConfiguration configuration){
        Realm.init(context);

        return Realm.getInstance(configuration);
    }

    @MainScope
    @Provides
    public RealmConfiguration provideRealmConfiguration(){
        return new RealmConfiguration.Builder()
                .name("SteemnoteRealm")
                .schemaVersion(1)
                .build();
    }

}
