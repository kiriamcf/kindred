package com.kindred.api.domain.animal

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SpeciesRepository : JpaRepository<Species, Long>
