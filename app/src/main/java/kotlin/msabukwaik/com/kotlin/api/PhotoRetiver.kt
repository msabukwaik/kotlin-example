package kotlin.msabukwaik.com.kotlin.api

import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.msabukwaik.com.kotlin.models.PhotoList

/**
 * Created by msabukwaik on 6/12/17.
 */
class PhotoRetiver {
    private val service: PhotoAPI

    init {
        val retrofit = Retrofit.Builder().
                baseUrl("https://pixabay.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        service = retrofit.create(PhotoAPI::class.java)
    }

    fun getPhotos(callback: Callback<PhotoList>){
        var call = service.getPhotos();
        call.enqueue(callback)
    }
}