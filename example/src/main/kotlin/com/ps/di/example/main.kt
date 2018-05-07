package com.soc.sense.apps.roompanel.js

import com.ps.di.DI
import com.ps.di.example.IPresenter
import com.ps.di.example.Presenter1
import com.ps.di.example.Presenter2
import com.ps.di.example.View
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    // every time injection is called, new presenter is created
    DI.define<IPresenter>{
        Presenter1()
    }

    // or the same instance is returned

//    var presenter2 = Presenter2()
//    DI.define<IPresenter>{
//        presenter2
//    }


    // or define an object directly

//    DI.define<IPresenter>(Presenter2())

    if (document.body != null) {
        onDOMReady()
    } else {
        document.addEventListener("DOMContentLoaded", { onDOMReady() })
    }
}

fun onDOMReady() {
    View(document.body!!)
}

