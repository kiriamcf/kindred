package com.kindred.api.domain.animal

import com.kindred.api.shared.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "breeds")
class Breed(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var name: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_id", nullable = false)
    var species: Species,
) : BaseEntity()
