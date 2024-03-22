package co.edu.udea.compumovil.gr10_20241.lab1.domain

import com.google.gson.annotations.SerializedName

data class ApiAuth(@SerializedName("auth_token") val authToken: String)