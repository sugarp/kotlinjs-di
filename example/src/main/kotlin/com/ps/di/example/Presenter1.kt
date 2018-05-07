package com.ps.di.example

class Presenter1 : IPresenter{
    override fun onActionConfirmed() {
        console.log("Presenter 1 handling the view action")
    }
}

