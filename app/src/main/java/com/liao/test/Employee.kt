package com.liao.test

import java.io.Serializable

data class Employee(var empId: Long, var name: String, var email: String, var mobile: String) :Serializable{
    companion object{

    }
}