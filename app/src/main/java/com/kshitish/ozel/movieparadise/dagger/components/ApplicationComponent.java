package com.kshitish.ozel.movieparadise.dagger.components;


import com.kshitish.ozel.movieparadise.App;
import com.kshitish.ozel.movieparadise.dagger.AppScope;
import com.kshitish.ozel.movieparadise.dagger.modules.ApplicationModule;
import com.kshitish.ozel.movieparadise.dagger.modules.HttpClientModule;
import com.kshitish.ozel.movieparadise.ui.detail.DetailFragment;
import com.kshitish.ozel.movieparadise.ui.main.MainFragment;
import com.kshitish.ozel.movieparadise.ui.search.SearchFragment;

import javax.inject.Singleton;

import dagger.Component;

@AppScope
@Singleton
@Component(modules = {
        ApplicationModule.class,
        HttpClientModule.class,
})
public interface ApplicationComponent {

    void inject(App app);

    void inject(MainFragment mainFragment);

    void inject(DetailFragment movieDetailsFragment);

    void inject(SearchFragment searchFragment);
}
