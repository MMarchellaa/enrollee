package com.mihalkovich.enrollee.service

import com.mihalkovich.enrollee.dto.EnrolleeDto
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class ProducerService(
    private val kafkaTemplate: KafkaTemplate<String, EnrolleeDto>,
) {
    fun produce(enrolleeDto: EnrolleeDto) {
        println("Producing the message: $enrolleeDto")
        kafkaTemplate.send("enrollee", enrolleeDto)
    }
}