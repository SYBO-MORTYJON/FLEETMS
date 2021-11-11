package com.napa.Hospital.parameters.repositories;

import com.napa.Hospital.parameters.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country , Integer> {
}
