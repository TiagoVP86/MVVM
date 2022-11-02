package com.example.mvvm

import android.provider.ContactsContract.CommonDataKinds.Email

class PersonRepository {
    fun login (email: String, password: String) : Boolean {
        return (email != "" && password != "")
    }
}