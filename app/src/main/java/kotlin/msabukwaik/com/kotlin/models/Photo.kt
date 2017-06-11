package kotlin.msabukwaik.com.kotlin.models

import java.io.Serializable

/**
 * Created by msabukwaik on 6/12/17.
 */
data class Photo(val id:String,
                 val likes: Int,
                 val favouites: Int,
                 val tags: String,
                 val previewUrl: String,
                 val webformatUrl: String) : Serializable {
}