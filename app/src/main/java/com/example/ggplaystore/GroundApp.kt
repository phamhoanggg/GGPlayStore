package com.example.ggplaystore

class GroupApp() {
    var title: String = ""
    val appList: ArrayList<App> = arrayListOf()

    constructor(title: String, appList: ArrayList<App>): this(){
        this.title = title
        this.appList.addAll(appList)
    }
}