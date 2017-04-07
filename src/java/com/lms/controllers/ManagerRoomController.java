package com.lms.controllers;


import com.lms.service.ManagerRoomService;
//import com.lms.service.ClassSectionMapService;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/Booking/")
public class ManagerRoomController {
    
 
    @Autowired
    private ManagerRoomService managerRoomService;
  
    
    @RequestMapping("/manageRoom")
    public String showAllItemCat(Map<String, Object> map) {       
        map.put("roomList", managerRoomService.listAllRoom());    
        return "manageRoom";
    }
 
    
}
