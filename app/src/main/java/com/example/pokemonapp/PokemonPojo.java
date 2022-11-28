package com.example.pokemonapp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PokemonPojo{
		@SerializedName("success")
		@Expose
		private token success;

		public token getSuccess() {
			return success;
		}
	}