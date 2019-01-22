package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    @SerializedName("student_id")
    String student_id;
    @SerializedName("username")
    String userName;
    @SerializedName("image_url")
    String image_url;
    @SerializedName("video_url")
    String video_url;

    public String getStudent_id(){
        return student_id;
    }
    public String getUserName(){
        return userName;
    }
    public String getImage_url(){
        return image_url;
    }
    public String getVideo_url(){
        return video_url;
    }
    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
}
