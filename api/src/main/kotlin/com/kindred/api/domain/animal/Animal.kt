package com.kindred.api.domain.animal

import com.kindred.api.domain.organization.Organization
import com.kindred.api.shared.entity.BaseEntity
import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "animals")
class Animal(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var name: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", nullable = false)
    val organization: Organization,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_id", nullable = false)
    var species: Species,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "breed_id")
    var breed: Breed? = null,

    var age: Int? = null,

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    var arrivalDate: LocalDate? = null,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var status: AnimalStatus = AnimalStatus.AVAILABLE,

    @ElementCollection
    @CollectionTable(name = "animal_photos", joinColumns = [JoinColumn(name = "animal_id")])
    @Column(name = "photo_url", nullable = false)
    var photos: MutableList<String> = mutableListOf(),
) : BaseEntity()
