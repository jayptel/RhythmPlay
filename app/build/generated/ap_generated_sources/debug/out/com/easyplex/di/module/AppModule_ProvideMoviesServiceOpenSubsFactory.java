package com.easyplex.di.module;

import com.easyplex.data.remote.ApiInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideMoviesServiceOpenSubsFactory implements Factory<ApiInterface> {
  private final AppModule module;

  public AppModule_ProvideMoviesServiceOpenSubsFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApiInterface get() {
    return provideMoviesServiceOpenSubs(module);
  }

  public static AppModule_ProvideMoviesServiceOpenSubsFactory create(AppModule module) {
    return new AppModule_ProvideMoviesServiceOpenSubsFactory(module);
  }

  public static ApiInterface provideMoviesServiceOpenSubs(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMoviesServiceOpenSubs());
  }
}
