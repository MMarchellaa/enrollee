package com.mihalkovich.enrollee.repository

import com.mihalkovich.enrollee.entity.ContactInfo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactInfoRepository: JpaRepository<ContactInfo, Long>{

}