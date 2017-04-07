package com.lms.dao;

import com.lms.model.ClassSectionMap;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

    
@Repository("classSectionMapDAO")
public class ClassSectionMapDAOImpl implements ClassSectionMapDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @SuppressWarnings("unchecked")
    @Override
    public List<ClassSectionMap> listClassSection(){
       return sessionFactory.getCurrentSession().createQuery("from ClassSectionMap").list();  
    }
    
    @Override
    public ClassSectionMap getClassSectionById(Integer iDx){
        return (ClassSectionMap) sessionFactory.getCurrentSession().get(ClassSectionMap.class, iDx);
    } 
    
    
    @Override
    public void removeClassSection(Integer iDx) {
        ClassSectionMap classSectionMap = (ClassSectionMap) sessionFactory.getCurrentSession().load(ClassSectionMap.class, iDx);
        if (null != classSectionMap) {
            sessionFactory.getCurrentSession().delete(classSectionMap);
        }
    }
    
    
    
}
