package com.mihalkovich.enrollee.service

import com.mihalkovich.enrollee.dto.EnrolleeAcceptanceDto
import com.mihalkovich.enrollee.entity.Enrollee
import com.mihalkovich.enrollee.mapper.EnrolleeMapper
import com.mihalkovich.enrollee.repository.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service


@Service
class EnrolleeService(
    val enrolleeRepository: EnrolleeRepository,
    val producerService: ProducerService,
    val enrolleeMapper: EnrolleeMapper,
    val contactInfoRepository: ContactInfoRepository,
    val emergencyContactRepository: EmergencyContactRepository,
    val studyCertificateRepository: StudyCertificateRepository,
    val dreamSpeciality: DreamSpecialityRepository,
    val logger: Logger = LoggerFactory.getLogger(EnrolleeService::class.java)
) {

    fun saveEnrollee(enrolleeAcceptanceDto: EnrolleeAcceptanceDto): Enrollee{
        producerService.produce(enrolleeMapper.fromAcceptanceToDto(enrolleeAcceptanceDto))
        val enrollee = enrolleeMapper.fromAcceptancetoEnrollee(enrolleeAcceptanceDto)
        contactInfoRepository.save(enrollee.contactInfo)
        emergencyContactRepository.save(enrollee.emergencyContactInfo)
        studyCertificateRepository.save(enrollee.studyCertificate)
        dreamSpeciality.save(enrollee.dreamSpeciality)
        return enrolleeRepository.save(enrollee)
    }
}