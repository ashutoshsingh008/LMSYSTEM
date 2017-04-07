package com.lms.dao;


import com.lms.model.ManageSection;
import java.util.List;

public interface SectionDAO {

    public List<ManageSection> listSection();
    public void saveSection(ManageSection section);
    public void removeSection(Integer secId);
    public ManageSection getSectionById(Integer secId);
    public ManageSection getSectionByName(String secName);
    
}
