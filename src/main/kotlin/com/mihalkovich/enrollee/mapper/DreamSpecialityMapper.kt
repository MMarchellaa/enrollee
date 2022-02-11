package com.mihalkovich.enrollee.mapper

import com.mihalkovich.enrollee.dto.DreamSpecialityDto
import com.mihalkovich.enrollee.entity.DreamSpeciality
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface DreamSpecialityMapper {

    fun toDreamSpeciality(dreamSpecialityDto: DreamSpecialityDto): DreamSpeciality

    fun toDto(dreamSpeciality: DreamSpeciality): DreamSpecialityDto
}