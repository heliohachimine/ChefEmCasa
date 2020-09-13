package com.example.chefemcasabff.controller

import com.example.chefemcasabff.service.HomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/home")
class HomeController(
        private val homeService: HomeService
) {

    @GetMapping
    fun getHomeScreen() = this.homeService.getHomeScreen()

}