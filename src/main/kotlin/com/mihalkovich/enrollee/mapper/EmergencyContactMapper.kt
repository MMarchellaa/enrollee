package com.mihalkovich.enrollee.mapper

import com.mihalkovich.enrollee.dto.EmergencyContactDto
import com.mihalkovich.enrollee.entity.EmergencyPersonContactInfo
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface EmergencyContactMapper {

    fun toEmergencyContact(emergencyContactDto: EmergencyContactDto): EmergencyPersonContactInfo

    fun toDto(emergencyPersonContactInfo: EmergencyPersonContactInfo): EmergencyContactDto
}