package com.example.chefemcasabff.controller

import com.example.chefemcasabff.service.HomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HomeController(
        private val homeService: HomeService
) {

    @GetMapping("/home")
    fun getHomeScreen() = this.homeService.getHomeScreen()

}