package com.lms.dao;

import com.lms.model.Country;
import java.util.List;

public interface CountryDAO {
    public void saveCountry(Country country);
    public List<Country> listCountry();
    public void removeCountry(Integer countryNo);
    public Country getCountryById(Integer countryNo);
}
