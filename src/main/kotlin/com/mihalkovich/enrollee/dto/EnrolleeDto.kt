package com.mihalkovich.enrollee.dto

data class EnrolleeDto(
    var name: String? = null,
    var patronymic: String? = null,
    var surname: String? = null,
    var telephoneNumber: String? = null,
    var email: String? = null,
    var testingResults: Map<String, Int>,
    var averageRating: String? = null,
    var isGoldMedalist: Boolean,
    var dreamSpeciality: DreamSpecialityDto? = null
    )
