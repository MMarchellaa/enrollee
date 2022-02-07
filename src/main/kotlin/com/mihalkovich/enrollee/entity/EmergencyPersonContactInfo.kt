package com.mihalkovich.enrollee.entity

import javax.persistence.*

@Entity
@Table(name = "emergency_contact_info")
data class EmergencyPersonContactInfo(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    @Column(name = "full_name", nullable = false)
    var fullName: String? = null,

    @Column(name = "telephone_number", nullable = false)
    var telephoneNumber: String? = null,

    @Column(name = "relationship", nullable = false)
    var relationship: String? = null
)
