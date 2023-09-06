package com.easyplex.di.module;

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
public final class AppModule_ProvideadplayingZFactory implements Factory<String> {
  private final AppModule module;

  public AppModule_ProvideadplayingZFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideadplayingZ(module);
  }

  public static AppModule_ProvideadplayingZFactory create(AppModule module) {
    return new AppModule_ProvideadplayingZFactory(module);
  }

  public static String provideadplayingZ(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideadplayingZ());
  }
}
