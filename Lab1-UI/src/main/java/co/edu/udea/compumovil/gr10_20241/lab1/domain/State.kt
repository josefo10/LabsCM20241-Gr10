package co.edu.udea.compumovil.gr10_20241.lab1.domain

import com.google.gson.annotations.SerializedName

data class State (
    @SerializedName("state_name") val name: String
)