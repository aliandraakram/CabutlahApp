package com.bangkit.cabutlahapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bangkit.cabutlahapp.retrofit.ApiConfig
import com.bangkit.cabutlahapp.retrofit.MapResponse
import com.google.android.gms.maps.model.LatLng
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ParserPlace {
    /*fun getNearbyPlaces(location: LatLng, type: String, key: String): LiveData<List<ResultsItem>> {
        val result = MutableLiveData<List<ResultsItem>>()
        val getData = ApiConfig.getApiService().getPlaces("json",location, type, 500, key)

        getData.enqueue(object : Callback<MapResponse> {
            override fun onResponse(call: Call<MapResponse>, response: Response<MapResponse>) {
                if (response.isSuccessful) {
                    result.postValue(response.body()!!.results)
                }

            }

            override fun onFailure(call: Call<MapResponse>, t: Throwable) {
                Log.d("getNearbyPlaces", t.message.toString())
            }
        })

        return result
    }*/


}