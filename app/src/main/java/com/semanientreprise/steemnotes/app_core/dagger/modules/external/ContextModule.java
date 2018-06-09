package com.semanientreprise.steemnotes.app_core.dagger.modules.external;

import android.content.Context;

import com.semanientreprise.steemnotes.app_core.dagger.scopes.MainScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private Context context;

    private ContextModule(Context context){
        this.context = context;
    }

    @Provides
    @MainScope
    public Context provideContext(){
        return context;
    }

}
