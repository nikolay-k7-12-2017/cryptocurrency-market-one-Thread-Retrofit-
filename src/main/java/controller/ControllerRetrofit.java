package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import interfaceAPI.MetodKotirovki;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.schedulers.Schedulers;

public class ControllerRetrofit {
     String BASE_URL = "https://api.exmo.com/v1/";
    MetodKotirovki metodKotirovki;

    public    MetodKotirovki getCotirovki() {
      /* Gson gson = new GsonBuilder()
                .setLenient()
                .create();
       Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();*/

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();

        metodKotirovki = retrofit.create(MetodKotirovki.class);
        return metodKotirovki;

    }

}
