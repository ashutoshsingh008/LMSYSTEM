package com.lms.service;

import com.lms.dao.ClassSectionMapDAO;
import com.lms.model.ClassSectionMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

    
@Service("classSectionMapService")
public class ClassSectionMapServiceImpl implements ClassSectionMapService{   
    
    
    @Autowired
    private ClassSectionMapDAO classSectionMapDAO;
    
    @Transactional
    @Override 
    public List<ClassSectionMap> listClassSection(){
        return classSectionMapDAO.listClassSection();
    }
    
    
    @Transactional
    @Override 
    public ClassSectionMap getClassSectionById(Integer iDx){
         return classSectionMapDAO.getClassSectionById(iDx);
    }    
    
    @Transactional
    @Override
    public void removeClassSection(Integer iDx) {
         classSectionMapDAO.removeClassSection(iDx);
    }
}
