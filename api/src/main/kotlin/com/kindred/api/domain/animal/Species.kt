package com.kindred.api.domain.animal

import com.kindred.api.shared.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "species")
class Species(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false, unique = true)
    var name: String,

    var scientificName: String? = null,

    var icon: String? = null,
) : BaseEntity()
