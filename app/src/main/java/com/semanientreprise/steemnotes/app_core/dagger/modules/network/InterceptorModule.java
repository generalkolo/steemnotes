package com.semanientreprise.steemnotes.app_core.dagger.modules.network;

import android.util.Log;

import com.semanientreprise.steemnotes.app_core.dagger.scopes.MainScope;

import dagger.Module;
import dagger.Provides;
import okhttp3.logging.HttpLoggingInterceptor;

@Module
public class InterceptorModule {

    @Provides
    @MainScope
    public HttpLoggingInterceptor provideInterceptor(){
        return new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.i("HttpLoggingInterceptor", message);
            }
        });
    }

}
