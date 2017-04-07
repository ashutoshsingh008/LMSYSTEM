package com.lms.dao;

import com.lms.model.ManagerRoom;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;



@Repository("managerRoomDAO")
//@Repository
public class ManagerRoomDAOImpl implements ManagerRoomDAO{
   
    @Autowired
    private SessionFactory sessionFactory;
    
    @Cacheable("customer")
    @Override
    public List<ManagerRoom> listAllRoom() {
    return sessionFactory.getCurrentSession().createQuery("from ManagerRoom").list();
    }
  
}