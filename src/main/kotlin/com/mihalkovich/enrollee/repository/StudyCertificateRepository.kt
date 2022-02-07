package com.mihalkovich.enrollee.repository

import com.mihalkovich.enrollee.entity.StudyCertificate
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudyCertificateRepository: JpaRepository<StudyCertificate, Long>{

}