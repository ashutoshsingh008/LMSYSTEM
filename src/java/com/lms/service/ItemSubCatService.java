package com.lms.service;
import com.lms.model.ItemSubCat;

import java.util.List;

public interface ItemSubCatService {
public List<ItemSubCat> listAllItemSubCat();
public void saveItemSubCat(ItemSubCat ItemSucat);

//public void saveItemCatSubCatMap(ItemCatSubCatMap itemCatSubCatMap);

public void removeItemSubCat(Integer itemSucatId);
public ItemSubCat getItemSubCatById(Integer itemSucatId);
//public List<ItemCatSubCatMap> listAllItemCatSubCat();
}
