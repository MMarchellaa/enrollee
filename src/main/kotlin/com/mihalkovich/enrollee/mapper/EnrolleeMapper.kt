package com.mihalkovich.enrollee.mapper

import com.mihalkovich.enrollee.dto.EnrolleeAcceptanceDto
import com.mihalkovich.enrollee.dto.EnrolleeDto
import com.mihalkovich.enrollee.entity.Enrollee
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(componentModel = "spring")
interface EnrolleeMapper {

    @Mapping(target = "testingResults", source = "testingResults")
    fun fromAcceptancetoEnrollee(enrolleeAcceptanceDto: EnrolleeAcceptanceDto): Enrollee

    fun toEnrolleeDto(enrollee: Enrollee): EnrolleeDto

    @Mappings(
        Mapping(target = "telephoneNumber", source = "contactInfo.telephoneNumber"),
        Mapping(target = "email", source = "contactInfo.email"),
        Mapping(target = "averageRating", source = "studyCertificate.averageRating"),
        Mapping(target = "isGoldMedalist", source = "studyCertificate.goldMedalist"),
        Mapping(target = "dreamSpeciality", source = "dreamSpeciality")
    )
    fun fromAcceptanceToDto(enrolleeAcceptanceDto: EnrolleeAcceptanceDto): EnrolleeDto

    fun fromDtoToEnrollee(enrolleeDto: EnrolleeDto): Enrollee
}