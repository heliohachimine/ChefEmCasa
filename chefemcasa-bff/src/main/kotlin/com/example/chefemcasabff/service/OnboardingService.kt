package com.example.chefemcasabff.service

import com.example.chefemcasabff.builder.OnboardingBuilder
import org.springframework.stereotype.Service

@Service
class OnboardingService {
    fun getOnboardingBuilder() = OnboardingBuilder()
}