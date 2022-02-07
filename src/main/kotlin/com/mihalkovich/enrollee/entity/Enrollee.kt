package com.mihalkovich.enrollee.entity

import javax.persistence.*

@Entity
@Table(name = "enrollee")
data class Enrollee(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    @Column(name = "name", nullable = false)
    var name: String? = null,

    @Column(name = "patronymic", nullable = false)
    var patronymic: String? = null,

    @Column(name = "surname", nullable = false)
    var surname: String? = null,

    @Column(name = "sex", nullable = false)
    var sex: String? = null,

    @Column(name = "year_of_birth", nullable = false)
    var yearOfBirth: String? = null,

    @Column(name = "native_city", nullable = false)
    var nativeCity: String? = null,

    @OneToOne
    @JoinColumn(name = "contact_info_id")
    var contactInfo: ContactInfo,

    @OneToOne
    @JoinColumn(name = "study_certificate_id")
    var studyCertificate: StudyCertificate,

    @OneToOne
    @JoinColumn(name = "emengency_contact_id")
    var emergencyContactInfo: EmergencyPersonContactInfo,

    @Column(name = "passport_number", nullable = false)
    var passportNumber: String? = null,

    @ElementCollection
    @CollectionTable(name = "subject_rating_mapping")
    @MapKeyColumn(name = "subject_name")
    @Column(name = "testing_results")
    var testingResults: Map<String, Int>? = linkedMapOf(),

    @OneToOne
    @JoinColumn(name = "dream_speciality_id")
    var dreamSpeciality: DreamSpeciality
)
