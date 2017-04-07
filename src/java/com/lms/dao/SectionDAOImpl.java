package com.lms.dao;

import com.lms.model.ManageSection;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SectionDAOImpl implements SectionDAO{
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<ManageSection> listSection() {
    return sessionFactory.getCurrentSession().createQuery("from ManageSection").list();
    }
    
    @Override
    public void saveSection(ManageSection section) {
    sessionFactory.getCurrentSession().merge(section);
    }
    
    
    @Override
    public void removeSection(Integer secId) {
        ManageSection section = (ManageSection) sessionFactory.getCurrentSession().load(ManageSection.class, secId);
        if (null != section) {
            sessionFactory.getCurrentSession().delete(section);
        }
    }

    @Override
    public ManageSection getSectionById(Integer secId) {
        return (ManageSection) sessionFactory.getCurrentSession().get(ManageSection.class, secId);
    }

    @Override
    public ManageSection getSectionByName(String secName) {
        Query query = sessionFactory.getCurrentSession().createQuery("from ManageSection WHERE secName = :secName");
        query.setString("SecName", secName);
        return (ManageSection) query.uniqueResult();
    }
    
  
    
}
