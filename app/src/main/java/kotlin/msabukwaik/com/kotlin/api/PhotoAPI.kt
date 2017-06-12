package kotlin.msabukwaik.com.kotlin.api

import kotlin.msabukwaik.com.kotlin.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by msabukwaik on 6/12/17.
 */
interface PhotoAPI {
    @GET("?key=5609095-9ff8c5987643bf8b987c3737a&q=yellow+flowers&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}