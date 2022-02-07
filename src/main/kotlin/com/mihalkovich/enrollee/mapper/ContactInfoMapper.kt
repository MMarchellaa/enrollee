package com.mihalkovich.enrollee.mapper

import com.mihalkovich.enrollee.dto.ContactInfoDto
import com.mihalkovich.enrollee.entity.ContactInfo
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ContactInfoMapper {

    fun toContactInfo(contactInfoDto: ContactInfoDto): ContactInfo

    fun toDto(contactInfo: ContactInfo): ContactInfoDto
}