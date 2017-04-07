package com.lms.service;


import com.lms.model.ManageSection;
import java.util.List;



public interface SectionService {
    
public List<ManageSection> listSection();
public void saveSection(ManageSection section);
public void removeSection(Integer secId);
public ManageSection getSectionById(Integer secId);
public ManageSection getSectionByName(String secName);

}
