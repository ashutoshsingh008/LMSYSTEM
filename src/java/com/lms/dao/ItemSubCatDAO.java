package com.lms.dao;
import com.lms.model.ItemSubCat;
import java.util.List;

public interface ItemSubCatDAO {
public List<ItemSubCat> listAllItemSubCat();
public void saveItemSubCat(ItemSubCat ItemSubCat);
//public void saveItemCatSubCatMap(ItemCatSubCatMap itemCatSubCatMap);

public void removeItemSubCat(Integer itemSubCatId);
public ItemSubCat getItemSubCatById(Integer itemSubCatId);  
//public List<ItemCatSubCatMap> listAllItemCatSubCat();
}
