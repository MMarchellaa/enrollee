package com.mihalkovich.enrollee.entity

import javax.persistence.*

@Entity
@Table(name = "dream_speciality")
data class DreamSpeciality(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    @Column(name = "university", nullable = false)
    var university: String? = null,

    @Column(name = "faculty", nullable = false)
    var faculty: String? = null,

    @Column(name = "speciality", nullable = false)
    var speciality: String? = null
)
