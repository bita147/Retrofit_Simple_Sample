package com.example.abc.retrofitdemo.transporter;

import com.example.abc.retrofitdemo.model.NestedJson;
import com.example.abc.retrofitdemo.model.SimpleJsonObject;
import com.squareup.okhttp.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Path;

public interface WebServices {
    String HOST = "https://demo0971036.mockable.io";

    // For Service Implementation Read Document http://square.github.io/retrofit/

    @GET("/getSimpleJsonObject")
    Call<SimpleJsonObject> getSimpleJsonObject();


    @GET("/getSimpleJsonArray")
    Call<ArrayList<String>> getSimpleJsonArray();


    @POST("/getJsonObjWithBody")
    Call<SimpleJsonObject> getJsonObjWithBody(@Body HashMap<String,String> params);


    @Headers({
            "Header: Header",
            "Header: Header"
    })
    @POST("/jsonObjWithheader")
    Call<SimpleJsonObject> getJsonObjWithHeader();


    @GET("onDynamicReplacement/{getid}/getData")
    Call<SimpleJsonObject> onDynamicReplacement(@Path("getid") String id);

    @GET("/getPlainTextResponse")
    Call<ResponseBody> getPlainStringResponse();


    @GET("/getNestedJsonObject")
    Call<NestedJson> getNestedJsonObj();

}
