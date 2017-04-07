package com.lms.dao;

import com.lms.model.ItemCat;
import java.util.List;

public interface ItemCatDAO {
public List<ItemCat> listAllItemCat();
public void saveItemCat(ItemCat ItemCat);
public void removeItemCat(Integer itemCatId);
public ItemCat getItemCatById(Integer itemCatId);
}
