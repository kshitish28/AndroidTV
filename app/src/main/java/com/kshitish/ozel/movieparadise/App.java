package com.kshitish.ozel.movieparadise;

import android.app.Application;

import com.kshitish.ozel.movieparadise.dagger.components.ApplicationComponent;
import com.kshitish.ozel.movieparadise.dagger.components.DaggerApplicationComponent;
import com.kshitish.ozel.movieparadise.dagger.modules.ApplicationModule;
import com.kshitish.ozel.movieparadise.dagger.modules.HttpClientModule;

public class App extends Application {

    private static App instance;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        // Creates Dagger Graph
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .httpClientModule(new HttpClientModule())
                .build();

        applicationComponent.inject(this);
    }

    public static App instance() {
        return instance;
    }

    public ApplicationComponent appComponent() {
        return applicationComponent;
    }
}
