package com.mihalkovich.enrollee.entity

import javax.persistence.*

@Entity
@Table(name = "contact_info")
data class ContactInfo(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    @Column(name = "telephone_number", nullable = false)
    var telephoneNumber: String? = null,

    @Column(name = "email", nullable = false)
    var email: String? = null
)
