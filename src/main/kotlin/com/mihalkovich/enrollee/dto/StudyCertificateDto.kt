package com.mihalkovich.enrollee.dto

data class StudyCertificateDto(
    var averageRating: String? = null,
    var ratingResults: Map<String, Int>,
    var isGoldMedalist: Boolean
    )
