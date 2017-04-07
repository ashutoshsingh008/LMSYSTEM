package com.lms.controllers;


import com.lms.service.SectionService;
import com.lms.service.ClassService;

import com.lms.model.ManageSection;
import com.lms.model.ManageClass;




import java.util.*;

import javax.validation.Valid;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
@RequestMapping("/admin")
public class SectionController {    
    

    
    @Autowired
    private SectionService sectionService;
    

    
    @RequestMapping("/manageSection")
    public String showSection(Map<String, Object> map) {
        map.put("section", new ManageSection());
        map.put("sectionList", sectionService.listSection());    
        return "manageSection";
    }
      
     
    @RequestMapping("/addSection")
    public String addSection(Map<String, Object> map) {
        map.put("section", new ManageSection());
        return "addSection";
    }
    
    
    @RequestMapping(value = "/saveSection", method = RequestMethod.POST)
    public String saveSection(Map<String, Object> map, @ModelAttribute("section") ManageSection section, @Valid ManageSection classValid, BindingResult result) {
        if (result.hasErrors()) {
            map.put("sectionList", sectionService.listSection());           
            return "addSection";
        } else {
            try {
                sectionService.saveSection(section);
                return "redirect:/admin/manageSection";
            } catch (ConstraintViolationException exp) {
                map.put("dbError", exp.getMessage());
                return "addSection";
            }
        }
    }
    
    
    @RequestMapping("/deleteSection/{secId}")
    public String deleteSection(Map<String, Object> map, @PathVariable("secId") Integer secId) {
            sectionService.removeSection(secId);
            return "redirect:/admin/manageSection";     
 
    }
    
    
    
    @RequestMapping("/editSection/{secId}")
    public String editSection(Map<String, Object> map, @PathVariable("secId") Integer secId) {
        map.put("section", sectionService.getSectionById(secId));      
        return "addSection";
    }
    
  

    
  
}
