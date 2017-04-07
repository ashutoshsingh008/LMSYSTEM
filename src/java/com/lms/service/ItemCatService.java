package com.lms.service;
import com.lms.model.ItemCat;
import java.util.List;


public interface ItemCatService {
public List<ItemCat> listAllItemCat();
public void saveItemCat(ItemCat itemCat);
public void removeItemCat(Integer itemCatId);
public ItemCat getItemCatById(Integer itemCatId);

}
