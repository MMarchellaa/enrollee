package com.mihalkovich.enrollee.repository

import com.mihalkovich.enrollee.entity.DreamSpeciality
import org.springframework.data.jpa.repository.JpaRepository

interface DreamSpecialityRepository: JpaRepository<DreamSpeciality, Long> {
}