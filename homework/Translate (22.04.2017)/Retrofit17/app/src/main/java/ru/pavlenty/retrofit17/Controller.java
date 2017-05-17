package ru.pavlenty.retrofit17;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Acer on 21.04.2017.
 */

public class Controller {
    static final String BASE_URL = "https://translate.yandex.net/";

    public static UmoriliApi getApi() {
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
        UmoriliApi umoriliApi = retrofit.create(UmoriliApi.class);
        return umoriliApi;
    }
}