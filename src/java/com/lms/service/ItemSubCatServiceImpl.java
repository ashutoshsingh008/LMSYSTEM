package com.lms.service;

import com.lms.dao.ItemSubCatDAO;
import com.lms.model.ItemSubCat;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemSubCatService")
public class ItemSubCatServiceImpl implements ItemSubCatService{
  @Autowired
    private ItemSubCatDAO itemSubCatDAO;
    
    @Transactional
    @Override
    public List<ItemSubCat> listAllItemSubCat() {
        return itemSubCatDAO.listAllItemSubCat();
    }
    
    
    
    //@Transactional
   // @Override
    //public List<ItemCatSubCatMap> listAllItemCatSubCat() {
      //    return itemSubCatDAO.listAllItemCatSubCat();
    //} 
    
    
    
    @Transactional
    @Override
    public void saveItemSubCat(ItemSubCat ItemSubCat) {
        itemSubCatDAO.saveItemSubCat(ItemSubCat);
    }
    
    @Transactional
    @Override
    public void removeItemSubCat(Integer itemSubCatId) {
        itemSubCatDAO.removeItemSubCat(itemSubCatId);
    }

    @Transactional
    @Override
    public ItemSubCat getItemSubCatById(Integer itemSubCatId) {
        return itemSubCatDAO.getItemSubCatById(itemSubCatId);
    }

//   @Transactional
//    @Override
//    public void saveItemCatSubCatMap(ItemCatSubCatMap itemSubCat) {
//        itemSubCatDAO.saveItemCatSubCatMap(itemSubCat);
//    }
       
}
