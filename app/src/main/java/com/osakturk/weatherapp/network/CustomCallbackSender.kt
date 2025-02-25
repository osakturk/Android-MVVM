package com.osakturk.weatherapp.network

import com.osakturk.weatherapp.util.DataHolder
import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers

/**
 * @author osakturk
 */

open class CustomCallbackSender {
     fun<T> sendRequest(call: Flowable<T>): Flowable<DataHolder<T>> {
        return call
                .observeOn(Schedulers.io())
                .subscribeOn(Schedulers.io())
                .map<DataHolder<T>> { data-> DataHolder.Success(data,true)}
                .doOnError{ t: Throwable ->  t.printStackTrace()}
    }
}