package com.semanientreprise.steemnotes.app_core.dagger.components;

import com.semanientreprise.steemnotes.app_core.dagger.modules.external.ContextModule;
import com.semanientreprise.steemnotes.app_core.dagger.modules.network.OkhttpClientModule;
import com.semanientreprise.steemnotes.app_core.dagger.modules.store.RealmModule;
import com.semanientreprise.steemnotes.app_core.dagger.scopes.MainScope;

import dagger.Component;

@MainScope
@Component(modules = {RealmModule.class, OkhttpClientModule.class})
public interface AppMainComponent {
}
