package com.kangkan.developer.retrofitinsertexample;


import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by MetroApp on 08-03-2016.
 */
public interface RegisterAPI {

    @FormUrlEncoded
    @POST("/insert.php")
    Call<Pojodemo> serverCall(

            @Field("name") String Name,
            @Field("email") String Email,
            @Field("address") String Address,
            @Field("mobile") String Mobile );

}
