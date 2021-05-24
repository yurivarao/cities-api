package com.github.yurivarao.citiesapi.states.repositories;

import com.github.yurivarao.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}