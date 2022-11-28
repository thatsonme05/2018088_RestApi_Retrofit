package com.example.pokemonapp;

import com.pokemonapp.myinventory.Model.Auth.Login;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {
        @FormUrlEncoded
        @POST("login")
        Call<Login> postLogin(@Field("email") String email,
                              @Field("password") String password);
    }