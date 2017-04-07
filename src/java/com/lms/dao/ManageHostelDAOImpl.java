package com.lms.dao;

import com.lms.model.ManageHostel;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("manageHostelDAO")
//@Repository
public class ManageHostelDAOImpl implements ManageHostelDAO{
   
    @Autowired
    private SessionFactory sessionFactory;
    
    
    @Override
    public List<ManageHostel> listAllHostel() {   
//    Criteria criteria = sessionFactory.getCurrentSession().createCriteria(ManageHostel.class,"mh")
//    .createAlias("mh.managerRoom","mr")
//    //.add(Restrictions.eq("mh.name", "Arsenal"))
//    .add(Restrictions.eq("mr.description", "aaa"));
//    List <ManageHostel> list = criteria.list();
//    
    return sessionFactory.getCurrentSession().createQuery("from ManageHostel").list();    
    
    //return list;
    }
    
}

    


