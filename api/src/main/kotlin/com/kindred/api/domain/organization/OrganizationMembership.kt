package com.kindred.api.domain.organization

import com.kindred.api.domain.user.User
import com.kindred.api.shared.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(
    name = "organization_memberships",
    uniqueConstraints = [UniqueConstraint(columnNames = ["user_id", "organization_id"])],
)
class OrganizationMembership(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", nullable = false)
    val organization: Organization,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var memberRole: MemberRole,
) : BaseEntity()
