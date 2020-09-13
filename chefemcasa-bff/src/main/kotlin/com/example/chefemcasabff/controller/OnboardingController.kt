package com.example.chefemcasabff.controller

import com.example.chefemcasabff.service.OnboardingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/onboarding")
class OnboardingController(
        private val onboardingService: OnboardingService
) {
    @GetMapping
    fun getOnboardingBuilder() = this.onboardingService.getOnboardingBuilder()

}