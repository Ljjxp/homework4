package com.bytedance.android.lesson.restapi.solution.bean;


import com.google.gson.annotations.SerializedName;

import java.net.URL;


/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */

public class Cat {

    @SerializedName("url")
    String url;
    @SerializedName("id")
    String id;

    public String getUrl(){
        return url;
    }
    // TODO-C1 (1) Implement your Cat Bean here according to the response json
}
