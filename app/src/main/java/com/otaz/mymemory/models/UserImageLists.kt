package com.otaz.mymemory.models

import com.google.firebase.firestore.PropertyName
import com.google.j2objc.annotations.Property

data class UserImageLists(
    @PropertyName("images") val images: List<String>? = null
)