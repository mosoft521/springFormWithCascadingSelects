package com.rockhoppertech.spring.service;

import com.rockhoppertech.spring.domain.City;
import com.rockhoppertech.spring.domain.State;

import java.util.Set;

public interface GeoService {

    public Set<State> findAllStates();

    public Set<City> findCitiesForState(String state);

}
