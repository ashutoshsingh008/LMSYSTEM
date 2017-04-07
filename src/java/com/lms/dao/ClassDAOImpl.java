package com.lms.dao;

import com.lms.model.ManageClass;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("classDAO")
//@Repository
public class ClassDAOImpl implements ClassDAO{
    @Autowired
    private SessionFactory sessionFactory;
    
    @SuppressWarnings("unchecked")
    @Override
    public List<ManageClass> listClass() {
    return sessionFactory.getCurrentSession().createQuery("from ManageClass").list();
    }
      
    @Override
    public void saveClass(ManageClass Classes) {
    sessionFactory.getCurrentSession().merge(Classes);
    }
    
    
    @Override
    public void removeClass(Integer classId) {
        ManageClass Classes = (ManageClass) sessionFactory.getCurrentSession().load(ManageClass.class, classId);
        if (null != Classes) {
            sessionFactory.getCurrentSession().delete(Classes);
        }
    }

    @Override
    public ManageClass getClassById(Integer classId) {
        return (ManageClass) sessionFactory.getCurrentSession().get(ManageClass.class, classId);
    }

    @Override
    public ManageClass getClassByName(String className) {
        Query query = sessionFactory.getCurrentSession().createQuery("from ManageClass WHERE className = :className");
        query.setString("ClassName", className);
        return (ManageClass) query.uniqueResult();
    }
  
}
