package com.example.capstone_design.retrofit;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface RetrofitPostAPI {

    @FormUrlEncoded
    @POST("/login")
    Call<Data> postLogin(@FieldMap HashMap<String, Object> param);

    @FormUrlEncoded
    @POST("/user")
    Call<Data> postUser(@FieldMap HashMap<String, Object> param);

    @FormUrlEncoded
    @POST("/user/update")
    Call<Data> postUserUpdate(@Header("Authorization") String authorization, @FieldMap HashMap<String, Object> param);

    @FormUrlEncoded
    @POST("/alarm")
    Call<Data> postAlarm(@Header("Authorization") String authorization, @FieldMap HashMap<String, Object> param);

    @FormUrlEncoded
    @POST("/alarm/option")
    Call<Data> postAlarmOption(@Header("Authorization") String authorization, @FieldMap HashMap<String, Object> param);
}
