package com.mihalkovich.enrollee.repository

import com.mihalkovich.enrollee.entity.Enrollee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EnrolleeRepository: JpaRepository<Enrollee, Long>{

}