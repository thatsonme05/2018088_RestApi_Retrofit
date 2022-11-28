package com.example.pokemonapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class token {
    @SerializedName("token")
    @Expose
    private String token;

    public String getToken() {
        return token;
    }
}