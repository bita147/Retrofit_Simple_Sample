package com.example.abc.retrofitdemo.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.abc.retrofitdemo.R;
import com.example.abc.retrofitdemo.model.NestedJson;
import com.example.abc.retrofitdemo.model.SimpleJsonObject;
import com.example.abc.retrofitdemo.transporter.Services;
import com.example.abc.retrofitdemo.transporter.Params;
import com.google.gson.Gson;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onSimpleJsonObject(View view) {
        showDialog();
        Services.getInstance().getSimpleJsonObjectService().enqueue(new Callback<SimpleJsonObject>() {
            @Override
            public void onResponse(Response<SimpleJsonObject> response, Retrofit retrofit) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + new Gson().toJson(response.body()), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Throwable t) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onSimpleJsonArray(View view) {
        showDialog();
        Services.getInstance().getSimpleJsonArrayService().enqueue(new Callback<ArrayList<String>>() {
            @Override
            public void onResponse(Response<ArrayList<String>> response, Retrofit retrofit) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + response.body().toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Throwable t) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onJsonObjectWithBody(View view) {
        showDialog();
        Services.getInstance().getJsonObjectWithBody(Params.getBodyParams()).enqueue(new Callback<SimpleJsonObject>() {
            @Override
            public void onResponse(Response<SimpleJsonObject> response, Retrofit retrofit) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + new Gson().toJson(response.body()), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Throwable t) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onJsonObjectWithHeader(View view) {
        showDialog();
        Services.getInstance().getJsonObjectWithHeader().enqueue(new Callback<SimpleJsonObject>() {
            @Override
            public void onResponse(Response<SimpleJsonObject> response, Retrofit retrofit) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + new Gson().toJson(response.body()), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Throwable t) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onDynamicReplacement(View view) {
        showDialog();
        Services.getInstance().onDynamicReplacement("getid").enqueue(new Callback<SimpleJsonObject>() {
            @Override
            public void onResponse(Response<SimpleJsonObject> response, Retrofit retrofit) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + new Gson().toJson(response.body()), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Throwable t) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void getPlainStringResponse(View view) {
        showDialog();
        Services.getInstance().getPlainStringResponse().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                dismissDialog();
                try {
                    Toast.makeText(MainActivity.this, "" + new String(response.body().bytes()), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Throwable t) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void readResponseHeader(View view) {
        showDialog();
        Services.getInstance().getSimpleJsonObjectService().enqueue(new Callback<SimpleJsonObject>() {
            @Override
            public void onResponse(Response<SimpleJsonObject> response, Retrofit retrofit) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + response.headers().toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Throwable t) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }


    public void onNestedJsonRequest(View view) {
        showDialog();
        Services.getInstance().getNestedJsonObj().enqueue(new Callback<NestedJson>() {
            @Override
            public void onResponse(Response<NestedJson> response, Retrofit retrofit) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + new Gson().toJson(response.body()), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Throwable t) {
                dismissDialog();
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    ProgressDialog pd;

    private void showDialog() {
        pd = ProgressDialog.show(MainActivity.this, null, "Please wait");
    }

    private void dismissDialog() {
        if (pd != null && pd.isShowing())
            pd.dismiss();
    }
}
