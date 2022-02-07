package com.mihalkovich.enrollee.mapper

import com.mihalkovich.enrollee.dto.StudyCertificateDto
import com.mihalkovich.enrollee.entity.StudyCertificate
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface StudyCertificateMapper {

    fun toContactInfo(studyCertificateDto: StudyCertificateDto): StudyCertificate

    fun toDto(studyCertificate: StudyCertificate): StudyCertificateDto
}