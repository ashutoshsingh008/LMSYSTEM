package com.lms.service;

import com.lms.dao.SearchDAO;
import com.lms.model.PopularSearch;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SearchDAO searchDAO;

    @Transactional
    @Override
    public List searchResults(String searchCriteria) {
        return searchDAO.searchResults(searchCriteria);
    }

    @Transactional
    @Override
    public List searchAllResults() {
        return searchDAO.searchAllResults();
    }

    @Transactional
    @Override
    public List listPopularSearches() {
        return searchDAO.listPopularSearches();
    }
    
    @Transactional
    @Override
    public void savePopularSearch(PopularSearch popularSearch) {
        searchDAO.savePopularSearch(popularSearch);
        searchDAO.deletePopularSearches();
    }
}
