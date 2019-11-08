package com.example.testsampleapp.ui.brand_ui

import android.view.View
import androidx.lifecycle.MutableLiveData
import com.example.testsampleapp.R
import com.example.testsampleapp.base.BaseViewModel
import com.example.testsampleapp.model.brand.BrandDao
import com.example.testsampleapp.model.brand.ClsBrand
import com.example.testsampleapp.network.APIInterface
import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import javax.inject.Inject

class ClsBrandViewModel : BaseViewModel() {

    @Inject
    lateinit var apiInterface: APIInterface
    val brandListAdapter: BrandListAdapter = BrandListAdapter()

    val loadingVisibility: MutableLiveData<Int> = MutableLiveData()
    val errorMessage: MutableLiveData<Int> = MutableLiveData()
    val errorClickListener = View.OnClickListener { loadPosts() }

    private lateinit var subscription: Disposable

    init {
        loadPosts()
    }

    override fun onCleared() {
        super.onCleared()
        subscription.dispose()
    }

    private fun loadPosts() {
        onRetrievePostListStart()
        val callReponseObj: Call<List<ClsBrand>> = apiInterface.getAllBrands(27, 1, 20)
        val response = callReponseObj.execute()
        if (response.isSuccessful) {
            var brandList = response.body()
            if (brandList?.isEmpty()!!) {
                onRetrievePostListSuccess(brandList)
            } else {
                onRetrievePostListError()
            }

        } else {
            onRetrievePostListError()
        }

        onRetrievePostListFinish()
    }

    private fun onRetrievePostListStart() {
        loadingVisibility.value = View.VISIBLE
        errorMessage.value = null
    }

    private fun onRetrievePostListFinish() {
        loadingVisibility.value = View.GONE
    }

    private fun onRetrievePostListSuccess(brandList: List<ClsBrand>) {
       // brandListAdapter.updatePostList(brandList)
    }

    private fun onRetrievePostListError() {
       // errorMessage.value = R.string.post_error
    }
}