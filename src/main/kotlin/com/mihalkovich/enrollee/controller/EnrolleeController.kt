package com.mihalkovich.enrollee.controller

import com.mihalkovich.enrollee.dto.EnrolleeAcceptanceDto
import com.mihalkovich.enrollee.service.EnrolleeService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EnrolleeController(
    val enrolleeService: EnrolleeService
    ) {

    @PostMapping
    fun saveEnrollee(@RequestBody enrolleeAcceptanceDto: EnrolleeAcceptanceDto){
        println(enrolleeAcceptanceDto)
        enrolleeService.saveEnrollee(enrolleeAcceptanceDto)
    }
}