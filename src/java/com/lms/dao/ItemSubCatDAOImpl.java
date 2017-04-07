package com.lms.dao;

import com.lms.model.ItemSubCat;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("itemSubCatDAO")
public class ItemSubCatDAOImpl implements ItemSubCatDAO {
    @Autowired
    private SessionFactory sessionFactory;
  
    
    @Override
    public List<ItemSubCat> listAllItemSubCat() {
        return sessionFactory.getCurrentSession().createQuery("from ItemSubCat").list();
    }
    

    @Override
    public void saveItemSubCat(ItemSubCat ItemSubCat){
        sessionFactory.getCurrentSession().merge(ItemSubCat);
    }
    
//    @Override
//    public void saveItemCatSubCatMap(ItemCatSubCatMap itemCatSubCatMap){
//        sessionFactory.getCurrentSession().merge(itemCatSubCatMap);
//    } 
//    
// 
    

    @Override
    public void removeItemSubCat(Integer itemSubCatId) {
        ItemSubCat subCat = (ItemSubCat) sessionFactory.getCurrentSession().load(ItemSubCat.class, itemSubCatId);
        if (null != subCat) {
            sessionFactory.getCurrentSession().delete(subCat);
        }
    }

    @Override
    public ItemSubCat getItemSubCatById(Integer itemSubCatId) {
        return (ItemSubCat) sessionFactory.getCurrentSession().get(ItemSubCat.class, itemSubCatId);
    }

    

   //@SuppressWarnings("unchecked")
   //@Override
   //public List<ItemCatSubCatMap> listAllItemCatSubCat(){
   //return sessionFactory.getCurrentSession().createQuery("from ItemCatSubCatMap").list();  
   //} 

    
    
    
    
    
    
    
    
    
    
    
}
