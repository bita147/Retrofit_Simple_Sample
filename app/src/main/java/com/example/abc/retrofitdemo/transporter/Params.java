package com.example.abc.retrofitdemo.transporter;

import java.util.HashMap;

public class Params {

    public  static HashMap<String,String> getBodyParams(){
        HashMap<String,String> params = new HashMap<>();
        params.put("K1","Value 1");
        params.put("K2","Value 2");
        params.put("K3","Value 3");
        params.put("K4","Value 4");
        params.put("K5","Value 5");
        return params;
    }
}
