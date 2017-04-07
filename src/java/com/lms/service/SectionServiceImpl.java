package com.lms.service;

import com.lms.dao.SectionDAO;
import com.lms.model.ManageSection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("sectionService")
public class SectionServiceImpl implements SectionService{
    @Autowired
    private SectionDAO sectionDAO;
    
    @Transactional
    @Override
    public List<ManageSection> listSection() {
        return sectionDAO.listSection();
    }
    
    
    @Transactional
    @Override
    public void saveSection(ManageSection section) {
        sectionDAO.saveSection(section);
    }
    
    @Transactional
    @Override
    public void removeSection(Integer secId) {
        sectionDAO.removeSection(secId);
    }

    @Transactional
    @Override
    public ManageSection getSectionById(Integer secId) {
        return sectionDAO.getSectionById(secId);
    }

    @Transactional
    @Override
    public ManageSection getSectionByName(String secName) {
        return sectionDAO.getSectionByName(secName);
    }
    
}
