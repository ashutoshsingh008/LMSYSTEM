package com.lms.controllers;


import com.lms.model.ManageClass;
import com.lms.model.ManageSection;
import com.lms.model.ClassSectionMap;


import com.lms.service.ClassService;
import com.lms.service.SectionService;
import com.lms.service.ClassSectionMapService;

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
@RequestMapping("/admin")
public class ClassSectionMapController {
    
    
    @Autowired
    private ClassService classService;
    
    @Autowired
    private SectionService sectionService;
    
    @Autowired
    private ClassSectionMapService classSectionMapService;
    
     
     @ModelAttribute("classList")
     public List<ManageClass> AllClassList(){
     return classService.listClass();
     }
     
    
     @RequestMapping("/classSectionMap")
     public String showCSMap(Map<String, Object> map) { 
     map.put("classSectionList", classSectionMapService.listClassSection()); 
     map.put("classList", classService.listClass());
     map.put("sectionList", sectionService.listSection());
     return "classSectionMap";
     }
     
   
     
     @RequestMapping("/classSectionMap/{classId}")
     public String filterCSMap(Map<String, Object> map,  @PathVariable("classId") Integer classId){
        
        ManageClass classDetails =  classService.getClassById(classId);
        List<ManageSection> sectionDetailsList = classDetails.getSections();
       
        if(sectionDetailsList.isEmpty()){           
        map.put("message", "No Record Found!!!");       
        }else{ 
        map.put("sectionList", sectionDetailsList);
        }
        return "classSectionFilter";
        
     }
         
    
     
    @RequestMapping("/deleteClassSectionMap/{iDx}")
    public String deleteCSMap(Map<String, Object> map, @PathVariable("iDx") Integer iDx) {           
    classSectionMapService.removeClassSection(iDx);
    return "redirect:/admin/classSectionMap";
    }


    @RequestMapping("/addClassSectionMap")
    public String addCSMap(Map<String, Object> map) {
        return "addClassSectionMap";
    }
    
}
