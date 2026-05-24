package com.kindred.api.domain.animal

import com.kindred.api.domain.organization.Organization
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AnimalRepository : JpaRepository<Animal, Long> {
    fun findAllByOrganization(organization: Organization): List<Animal>
    fun findAllByOrganizationAndStatus(organization: Organization, status: AnimalStatus): List<Animal>
}
