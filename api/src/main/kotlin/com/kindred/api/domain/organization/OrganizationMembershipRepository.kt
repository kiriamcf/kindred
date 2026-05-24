package com.kindred.api.domain.organization

import com.kindred.api.domain.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrganizationMembershipRepository : JpaRepository<OrganizationMembership, Long> {
    fun findAllByUser(user: User): List<OrganizationMembership>
    fun findAllByOrganization(organization: Organization): List<OrganizationMembership>
    fun existsByUserAndOrganization(user: User, organization: Organization): Boolean
}
