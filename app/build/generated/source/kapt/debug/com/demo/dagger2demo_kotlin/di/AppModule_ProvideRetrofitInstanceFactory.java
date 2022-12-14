// Generated by Dagger (https://dagger.dev).
package com.demo.dagger2demo_kotlin.di;

import com.demo.dagger2demo_kotlin.api.RetroServiceInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRetrofitInstanceFactory implements Factory<RetroServiceInterface> {
  private final Provider<String> bASE_URLProvider;

  public AppModule_ProvideRetrofitInstanceFactory(Provider<String> bASE_URLProvider) {
    this.bASE_URLProvider = bASE_URLProvider;
  }

  @Override
  public RetroServiceInterface get() {
    return provideRetrofitInstance(bASE_URLProvider.get());
  }

  public static AppModule_ProvideRetrofitInstanceFactory create(Provider<String> bASE_URLProvider) {
    return new AppModule_ProvideRetrofitInstanceFactory(bASE_URLProvider);
  }

  public static RetroServiceInterface provideRetrofitInstance(String BASE_URL) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRetrofitInstance(BASE_URL));
  }
}
