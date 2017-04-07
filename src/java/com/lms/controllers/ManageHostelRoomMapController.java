package com.lms.controllers;


//import com.lms.model.ItemCatSubCatMap;


import com.lms.model.ManageHostel;
import com.lms.model.ManagerRoom;
import com.lms.service.ManageHostelService;


import java.util.*;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin/Booking/")
public class ManageHostelRoomMapController {
   
    @Autowired
    private ManageHostelService manageHostelService;
  

     
     @RequestMapping("/hostelRoomMap")
     public String showHostelRoomMap(Map<String, Object> parameters, HttpServletRequest request) {
       List<ManageHostel> hostelList= manageHostelService.listAllHostel();      
       parameters.put("hostelList", hostelList);
       return "hostelRoomMap";
       
    }
}    
     
 