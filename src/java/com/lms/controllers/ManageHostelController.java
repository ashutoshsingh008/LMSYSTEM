
package com.lms.controllers;


import com.lms.model.HostelList;
import com.lms.model.ManageHostel;
import com.lms.model.ManagerRoom;
import com.lms.service.ManageHostelService;
import java.util.*;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/Booking/")
public class ManageHostelController {
    


    @Autowired
    private ManageHostelService manageHostelService;
    
    @ExceptionHandler(NullPointerException.class)
    public String handleException(NullPointerException ex)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("message", ex.getMessage());
        return "manageHostel";
    }

    
    
    @RequestMapping("/manageHostel")
    public String showAllHostel(Map<String, Object> map, Authentication authentication, HttpServletRequest request) {
        //System.out.println("principal-------------"+principal.getName());
        //System.out.println("getClass-------------"+principal.getClass());      
        
        //System.out.println("scontext-----///---"+scontext.getRealPath("/"));
        System.out.println("scontext--------"+request.getSession().getServletContext().getRealPath(""));
        System.out.println("scontext--------"+request.getSession().getServletContext().getRealPath("/"));
         
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
     
        System.out.println("User has authorities:---------- " + userDetails.getAuthorities());
        map.put("hostelList", manageHostelService.listAllHostel());  
        return "manageHostel";
    }
 
    
    @RequestMapping(value = "/jsonProducer", produces = "application/Json", method = RequestMethod.GET)
    public @ResponseBody List <ManageHostel> showAllHList() {
        List<ManageHostel> hList = new ArrayList<ManageHostel>();
        hList = manageHostelService.listAllHostel(); 
        return hList;       
    }
      
        
   @RequestMapping(value = "/xmlProducer", produces = "application/xml", method = RequestMethod.GET)
    public @ResponseBody HostelList listHostel() {
        List<ManageHostel> hList = manageHostelService.listAllHostel();  
        HostelList hostels = new HostelList();        
        for (ManageHostel mh: hList){
        hostels.getHostels().add(mh);    
        }                  
        return hostels;//You many decide to return HttpStatus.NOT_FOUND;    
   }
        
        
        
   @RequestMapping(value = "/jsonClint", method = RequestMethod.GET)
   public String getAllJSON(Map<String, Object> map) {


   final String uri = "http://localhost:8084/lms/admin/Booking/jsonProducer.json";
     
    RestTemplate restTemplate = new RestTemplate();
    //we can't get List<Employee> because JSON convertor doesn't know the type of
    //object in the list and hence convert it to default JSON object type LinkedHashMap
    List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(uri, List.class);
    System.out.println("---------------------usersMap"+usersMap);
    if(usersMap!=null){
        for(LinkedHashMap<String, Object> map1 : usersMap){
         System.out.println("Hostel : id="+map1.get("hostel_id")+", Hostel Name="+map1.get("hostel_name")+", Description="+map1.get("description"));
        }
    }else{
        System.out.println("No Hostel exist----------");
    }
       map.put("hostelList", usersMap);  
       return "manageHostel";
   } 
        
        
   @RequestMapping(value = "/xmlClint", method = RequestMethod.GET)
   public String getAllXML(Map<String, Object> map) {
     
   final String uri = "http://localhost:8084/lms/admin/Booking/xmlProducer.xml";
     
    RestTemplate restTemplate = new RestTemplate();
    HostelList result = restTemplate.getForObject(uri, HostelList.class);
    List<ManageHostel> map1 = result.getHostels(); 
   for(ManageHostel mh : map1){
     
      System.out.println("Hostel Name="+mh.getHostel_name());
      List<ManagerRoom> map2 = mh.getManagerRoom();
      for(ManagerRoom mr : map2){
       System.out.println("Room Name="+mr.getRoom_name()+" Room Description :"+ mr.getDescription());   
          
      }
   }
   
       map.put("hostelList", map1);  
       return "manageHostel";
}
        
        
        
        
        
        
        
        
        
        
    @RequestMapping("/bookingForm")
    //just for testing..having no any functionality
    public String showBookingForm(Map<String, Object> map) {       
    map.put("hostelList", null);    
    return "manageHostel";
    }
    


    
}
