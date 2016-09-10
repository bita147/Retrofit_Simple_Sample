package com.example.abc.retrofitdemo.transporter;

import com.example.abc.retrofitdemo.model.NestedJson;
import com.example.abc.retrofitdemo.model.SimpleJsonObject;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class Services {
    private static WebServices service;
    private static Services INSTANCE = new Services();
    private static OkHttpClient okHttpClient = new OkHttpClient(); // use for set request time out

    public static Services getInstance() {
        if (service == null){
            okHttpClient.setReadTimeout(60, TimeUnit.SECONDS);
            okHttpClient.setConnectTimeout(60, TimeUnit.SECONDS);
            service = new Retrofit.Builder().baseUrl(WebServices.HOST).addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build().create(WebServices.class);
        }
        return INSTANCE;
    }

    public Call<SimpleJsonObject> getSimpleJsonObjectService() {
        return service.getSimpleJsonObject();
    }

    public Call<ArrayList<String>> getSimpleJsonArrayService() {
        return service.getSimpleJsonArray();
    }

    public Call<SimpleJsonObject> getJsonObjectWithBody(HashMap<String,String> params) {
        return service.getJsonObjWithBody(params);
    }

    public Call<SimpleJsonObject> getJsonObjectWithHeader() {
        return service.getJsonObjWithHeader();
    }

    public Call<SimpleJsonObject> onDynamicReplacement(String id) {
        return service.onDynamicReplacement(id);
    }

    public Call<ResponseBody> getPlainStringResponse() {
        return service.getPlainStringResponse();
    }

    public Call<NestedJson> getNestedJsonObj() {
        return service.getNestedJsonObj();
    }
}
