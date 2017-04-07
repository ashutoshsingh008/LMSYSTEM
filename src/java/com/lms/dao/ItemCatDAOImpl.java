package com.lms.dao;

import com.lms.model.ItemCat;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("itemCatDAO")
//@Repository
public class ItemCatDAOImpl implements ItemCatDAO{
   
    @Autowired
    private SessionFactory sessionFactory;
    
    
    @Override
    public List<ItemCat> listAllItemCat() {
    return sessionFactory.getCurrentSession().createQuery("from ItemCat").list();
    }
      
    @Override
    public void saveItemCat(ItemCat ItemCat) {
    sessionFactory.getCurrentSession().merge(ItemCat);
    }
    
    
    @Override
    public void removeItemCat(Integer itemCatId) {
        ItemCat ItemCat = (ItemCat) sessionFactory.getCurrentSession().load(ItemCat.class, itemCatId);
        if (null != ItemCat) {
            sessionFactory.getCurrentSession().delete(ItemCat);
        }
    }

    @Override
    public ItemCat getItemCatById(Integer itemCatId) {
        return (ItemCat) sessionFactory.getCurrentSession().get(ItemCat.class, itemCatId);
    }

    
}
