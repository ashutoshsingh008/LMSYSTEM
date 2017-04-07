package com.lms.service;
import com.lms.model.ClassSectionMap;
import java.util.List;


public interface ClassSectionMapService {
    
    public List<ClassSectionMap> listClassSection();
    public ClassSectionMap getClassSectionById(Integer iDx);  
    public void removeClassSection(Integer iDx);
    
}
