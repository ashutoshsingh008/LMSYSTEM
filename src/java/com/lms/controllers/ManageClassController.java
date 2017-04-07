package com.lms.controllers;


import com.lms.service.ClassService;
import com.lms.service.ClassSectionMapService;

import com.lms.model.ManageClass;
import java.util.Map;
import javax.validation.Valid;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/admin")
public class ManageClassController {    
    
    @Autowired
    private ClassService classService;
    
    @RequestMapping("/manageClass")
    public String showClass(Map<String, Object> map) {       
        map.put("classList", classService.listClass());    
        return "manageClass";
    }
  
    @RequestMapping("/addClass")
    public String addClass(Map<String, Object> map) {
        map.put("classes", new ManageClass());
        return "addClass";
    }
    
    
    
    
    @RequestMapping(value = "/saveClass", method = RequestMethod.POST)
    public String saveClass(Map<String, Object> map, @ModelAttribute("classes") ManageClass classes, @Valid ManageClass classValid, BindingResult result) {
        if (result.hasErrors()) {
            map.put("classList", classService.listClass());           
            return "addClass";
        } else {
            try {
                classService.saveClass(classes);
                return "redirect:/admin/manageClass";
            } catch (ConstraintViolationException exp) {
                map.put("dbError", exp.getMessage());
                return "addClass";
            }
        }
    }
    
    
    @RequestMapping("/deleteClass/{classId}")
    public String deleteClass(Map<String, Object> map, @PathVariable("classId") Integer classId) {
       classService.removeClass(classId);
       return "redirect:/admin/manageClass";     
 
    }
    
    
    
    @RequestMapping("/editClass/{classId}")
    public String editClass(Map<String, Object> map, @PathVariable("classId") Integer classId) {
        map.put("classes", classService.getClassById(classId));      
        return "addClass";
    }
    
 

    
}
