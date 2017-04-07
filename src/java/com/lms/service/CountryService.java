package com.lms.service;

import com.lms.model.Country;
import java.util.List;

public interface CountryService {
    public void saveCountry(Country country);
    public List<Country> listCountry();
    public void removeCountry(Integer countryNo);
    public Country getCountryById(Integer countryNo);
}
