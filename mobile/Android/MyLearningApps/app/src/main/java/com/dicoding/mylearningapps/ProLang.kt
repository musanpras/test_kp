package com.dicoding.mylearningapps

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
data class ProLang (
    var image: Int = 0,
    var name: String = "",
    var level: String = "",
    var desc: String = ""
): Parcelable
