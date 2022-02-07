package com.mihalkovich.enrollee.repository

import com.mihalkovich.enrollee.entity.EmergencyPersonContactInfo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmergencyContactRepository: JpaRepository<EmergencyPersonContactInfo, Long>{

}