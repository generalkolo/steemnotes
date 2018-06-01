package com.semanientreprise.steemnotes.service;

import com.semanientreprise.steemnotes.Model.userDetails;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by GeneralKolo on 2018/03/17.
 */

public interface APISERVICE {

    //Retrofit For getting steem and sbd prices
    @FormUrlEncoded
    @POST("/postdata")
    Call<userDetails> getUserDetails(
            @Field("name") String username
    );
}