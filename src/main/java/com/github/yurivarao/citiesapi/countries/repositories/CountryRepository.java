package com.github.yurivarao.citiesapi.countries.repositories;

import com.github.yurivarao.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
