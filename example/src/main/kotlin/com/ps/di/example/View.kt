package com.ps.di.example

import com.ps.di.DI
import com.ps.di.example.IPresenter
import org.w3c.dom.Element
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLElement
import kotlin.browser.document

class View {
    private var element : Element

    //inject the presenter
    private var presenter = DI.inject<IPresenter>()

    constructor(parentNode: HTMLElement) {
        element = document.createElement("div")
        var btn = document.createElement("button") as HTMLButtonElement

        btn.innerText = "Action"
        btn.onclick = {
            presenter.onActionConfirmed()
        }

        element.appendChild(btn)

        // finally enter element
        parentNode.appendChild(element)
    }
}