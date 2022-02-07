package com.mihalkovich.enrollee.dto

data class EnrolleeAcceptanceDto(
    var name: String? = null,

    var patronymic: String? = null,

    var surname: String? = null,

    var sex: String? = null,

    var yearOfBirth: String? = null,

    var nativeCity: String? = null,

    var contactInfo: ContactInfoDto,

    var studyCertificate: StudyCertificateDto,

    var emergencyContactInfo: EmergencyContactDto,

    var passportNumber: String? = null,

    var testingResults: Map<String, Int>? = hashMapOf(),

    var dreamSpeciality: DreamSpecialityDto
)
