package com.mihalkovich.enrollee.entity

import javax.persistence.*

@Entity
@Table(name = "study_certificate")
data class StudyCertificate(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    @Column(name = "average_rating", nullable = false)
    var averageRating: String? = null,

    @ElementCollection
    @CollectionTable(name = "school_subject_rating_mapping")
    @MapKeyColumn(name = "subject_name")
    @Column(name = "rating_results")
    var ratingResults: Map<String, Int>,

    @Column(name = "is_gold_medalist", nullable = false)
    var isGoldMedalist: Boolean
)
