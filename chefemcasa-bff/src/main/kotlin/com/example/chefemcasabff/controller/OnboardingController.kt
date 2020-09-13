package com.example.chefemcasabff.controller

import com.example.chefemcasabff.service.OnboardingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OnboardingController(
        private val onboardingService: OnboardingService
) {
    @GetMapping("/onboarding")
    fun getOnboardingBuilder() = this.onboardingService.getOnboardingBuilder()

}