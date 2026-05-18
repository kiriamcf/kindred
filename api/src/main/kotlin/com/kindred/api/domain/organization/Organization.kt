package com.kindred.api.domain.organization

import com.kindred.api.shared.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "organizations")
class Organization(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false, unique = true)
    var slug: String,

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    var address: String? = null,

    var phone: String? = null,

    @Column(nullable = false)
    var email: String,

    var logo: String? = null,
) : BaseEntity()
