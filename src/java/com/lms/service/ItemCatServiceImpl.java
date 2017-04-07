package com.lms.service;

import com.lms.dao.ItemCatDAO;
import com.lms.model.ItemCat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("itemCatService")
//@Service
public class ItemCatServiceImpl implements ItemCatService{
    
    @Autowired
    private ItemCatDAO itemCatDAO;
    
    @Transactional
    @Override
    public List<ItemCat> listAllItemCat() {
        return itemCatDAO.listAllItemCat();
    }
    
    
    @Transactional
    @Override
    public void saveItemCat(ItemCat ItemCat) {
        itemCatDAO.saveItemCat(ItemCat);
    }
    
    @Transactional
    @Override
    public void removeItemCat(Integer itemCatId) {
        itemCatDAO.removeItemCat(itemCatId);
    }

    @Transactional
    @Override
    public ItemCat getItemCatById(Integer itemCatId) {
        return itemCatDAO.getItemCatById(itemCatId);
    }




}
