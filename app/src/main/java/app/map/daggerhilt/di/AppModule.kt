package app.map.daggerhilt.di

import app.map.daggerhilt.data.remote.MyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) //Install that into singleton class component
//The componnent whatever you choose here will decide the dependencies provide in the module will actually live
object AppModule {

    @Provides
    @Singleton // called scope & it will have only single instance throughout lifetime
    //If its not present all the repository accessing this will create seperate instances
    fun provideApiInstance(): MyApi {
        return Retrofit
            .Builder()
            .baseUrl("https://google.com")
            .client(createOkHttpClient()) // Use custom OkHttpClient with logging
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MyApi::class.java)
    }

    private fun createOkHttpClient(): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY // Set log level as needed
        }
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }

    //We Created seperate module for repository
//    @Provides
//    @Singleton
//    fun provideRepository(
//        api: MyApi,
//        app: Application,
//        @Named("hello1") hello1: String
//    ): MyRepository{
//        //Here we need MyApi
//        return MyRepositoryImpl(api,app)
//    }

    @Provides
    @Singleton
    @Named("hello1") // If there is multiple strings provide we can differentiate by Named
    fun provideString1() = "Hello1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello2"
}