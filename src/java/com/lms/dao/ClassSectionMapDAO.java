package com.lms.dao;
import com.lms.model.ClassSectionMap;
import java.util.List;


public interface ClassSectionMapDAO {
    
    public List<ClassSectionMap> listClassSection();
    public ClassSectionMap getClassSectionById(Integer iDx);
    public void removeClassSection(Integer iDx);
}
