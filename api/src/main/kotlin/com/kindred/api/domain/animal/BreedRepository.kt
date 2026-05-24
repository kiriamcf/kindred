package com.kindred.api.domain.animal

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BreedRepository : JpaRepository<Breed, Long> {
    fun findAllBySpecies(species: Species): List<Breed>
}
