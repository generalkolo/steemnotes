package com.semanientreprise.steemnotes.app_core.dagger.modules.network;

import com.semanientreprise.steemnotes.app_core.dagger.scopes.MainScope;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Module(includes = {InterceptorModule.class})
public class OkhttpClientModule {

    @Provides
    @MainScope
    public OkHttpClient provideOkHttpClient(HttpLoggingInterceptor interceptor){
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.connectTimeout(120, TimeUnit.SECONDS);
        clientBuilder.readTimeout(120, TimeUnit.SECONDS);
        clientBuilder.writeTimeout(120, TimeUnit.SECONDS);
        clientBuilder.addNetworkInterceptor(interceptor);
        clientBuilder.retryOnConnectionFailure(true);

        return clientBuilder.build();
    }

}
