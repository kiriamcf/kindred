package com.kindred.api.domain.organization

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface OrganizationRepository : JpaRepository<Organization, Long> {
    fun findBySlug(slug: String): Optional<Organization>
    fun existsBySlug(slug: String): Boolean
}
