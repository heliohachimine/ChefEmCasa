package com.example.chefemcasabff.service

import com.example.chefemcasabff.builder.HomeBuilder
import org.springframework.stereotype.Service

@Service
class HomeService {

    fun getHomeScreen() = HomeBuilder

}