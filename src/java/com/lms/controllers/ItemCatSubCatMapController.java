package com.lms.controllers;


import com.lms.model.ItemCat;
import com.lms.model.ItemSubCat;
//import com.lms.model.ItemCatSubCatMap;


import com.lms.service.ItemCatService;
import com.lms.service.ItemSubCatService;


import java.util.*;
import javax.validation.Valid;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/admin/Inventory/")
public class ItemCatSubCatMapController {
   @Autowired
    private ItemCatService itemCatService;
    
    @Autowired
    private ItemSubCatService itemSubCatService;
    
  
    
     @RequestMapping("/itemCatSubCatMap")
     public String showItemCatSubCatMap(Map<String, Object> map) { 
     map.put("itemCatList", itemCatService.listAllItemCat());
     map.put("itemSubCatList", itemSubCatService.listAllItemSubCat());
     //map.put("itemCatSubCatList", itemSubCatService.listAllItemCatSubCat()); 
     return "itemCatSubCatMap";
     } 
}
