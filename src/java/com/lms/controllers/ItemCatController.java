package com.lms.controllers;


import com.lms.service.ItemCatService;
//import com.lms.service.ClassSectionMapService;

import com.lms.model.ItemCat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/admin/Inventory/")
public class ItemCatController {
    
 
    @Autowired
    private ItemCatService itemCatService;
  
    
    @RequestMapping("/manageItemCategory")
    public String showAllItemCat(Map<String, Object> map) {       
        map.put("itemCatList", itemCatService.listAllItemCat());    
        return "manageItemCategory";
    }
    
    
    //@RequestMapping("/manageItemCategoryRest")
    @RequestMapping(value="/manageItemCategoryRest", method = RequestMethod.GET,headers="Accept=application/json")
    public @ResponseBody List<ItemCat> showAllItemCatRest(Map<String, Object> map) {       
       //map.put("itemCatList", itemCatService.listAllItemCat());
       List<ItemCat> itemcat = new ArrayList<ItemCat>();
       itemcat = itemCatService.listAllItemCat();                 
       return itemcat;
    }
    
    
    

    @RequestMapping("/deleteItemCategory/{itemCatId}")
    public String deleteItemCat(Map<String, Object> map, @PathVariable("itemCatId") Integer itemCatId) {
       itemCatService.removeItemCat(itemCatId);
       map.put("itemCatList", itemCatService.listAllItemCat());
       return "redirect:/admin/Inventory/manageItemCategory"; 
    }  
    
}
