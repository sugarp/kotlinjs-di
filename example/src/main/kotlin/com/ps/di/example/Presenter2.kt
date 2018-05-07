package com.ps.di.example

class Presenter2 : IPresenter{
    override fun onActionConfirmed() {
        console.log("Presenter 2 handling the view action")
    }
}