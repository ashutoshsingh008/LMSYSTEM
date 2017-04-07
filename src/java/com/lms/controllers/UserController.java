package com.lms.controllers;

import com.lms.model.Search;
import com.lms.model.User;
import com.lms.service.CountryService;
import com.lms.service.MailService;
import com.lms.service.StateService;
import com.lms.service.UserService;
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


import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;






@Controller
@RequestMapping("/admin")
public class UserController {
    @Value("${emailFrom}")
    String emailFrom;

    @Autowired
    private MailService mailService;
    
    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private UserService userService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @RequestMapping("/manageUsers")
    public String showManageUsers(Map<String, Object> map) {
        map.put("user", new User());
        map.put("userList", userService.listUser());
        map.put("countryList", countryService.listCountry());
        map.put("stateList", stateService.listState());
        return "manageUsers";
    }
    
    @RequestMapping("/addUser")
    public String addUser(Map<String, Object> map) {
        map.put("user", new User());
        return "addUser";
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(Map<String, Object> map, @ModelAttribute("user") User user, @Valid User userValid, BindingResult result) {
        if (result.hasErrors()) {
            map.put("countryList", countryService.listCountry());
            map.put("stateList", stateService.listState());
            return "addUser";
        } else {
            try {
                userService.saveUser(user);
                
        String name = user.getUserName();
        User userName = userService.getUserByUsername(name);
        String msg;
        if (userName != null) {
            map.put("userDetails", userName);
            //mailService.sendMail(emailFrom, userName.getEmailAddress(),"LMS Registration : Details",userName.getFirstName()+"--"+userName.getUserName() +"--"+ userName.getPassword());
            
            
            
            
        String recipientAddress = userName.getEmailAddress();
        String subject = "LMS Registration : Details";
        String message = userName.getFirstName()+"--"+userName.getUserName() +"--"+ userName.getPassword();
         
     
         
        // creates a simple e-mail object
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(message);
//MimeBodyPart htmlPart = new MimeBodyPart();
//htmlPart.setContent("<h1>Sample</h1><p>This is a sample HTML part</p>", "text/html");
        // sends the e-mail
        mailSender.send(email);
            
            
            
            
            
            
            
            
           msg = "Password sent to " + userName.getEmailAddress();
        } else {
           msg = "Invalid Username. Please try again";
        }            
           
            System.out.println(msg);
            return "redirect:/admin/manageUsers";
            } catch (ConstraintViolationException exp) {
                map.put("dbError", exp.getMessage());
                return "manageUsers";
            }
        }
    }

    @RequestMapping("/deleteUser/{userNo}")
    public String deleteUser(Map<String, Object> map, @PathVariable("userNo") Integer userNo) {
        User user = userService.getUserById(userNo);
        if(!user.getUserName().equals("admin")) {
            userService.removeUser(userNo);
            return "redirect:/admin/manageUsers";
        }
        else {
            map.put("dbError", "You cannot delete the admin user.");
            map.put("user", new User());
            map.put("userList", userService.listUser());
            map.put("countryList", countryService.listCountry());
            map.put("stateList", stateService.listState());
            return "manageUsers";           
        }
    }
    
    @RequestMapping("/editUser/{userNo}")
    public String editUser(Map<String, Object> map, @PathVariable("userNo") Integer userNo) {
        map.put("user", userService.getUserById(userNo));
        map.put("countryList", countryService.listCountry());
        map.put("stateList", stateService.listState());
        return "addUser";
    }

    @RequestMapping("/forgotPassword")
    public String showForgotPassword(Map<String, Object> map) {
        Search search = new Search();
        map.put("search", search);
        return "forgotPassword";
    }

    @RequestMapping("/retrievePassword/{userName}")
    public String retrievePassword(Map<String, Object> map, @PathVariable("userName") String userName) {
        User user = userService.getUserByUsername(userName);
        String message;
        if (user != null) {
            map.put("userDetails", user);
            mailService.sendMail(emailFrom,
            user.getEmailAddress(),
            "Sharanam & Vaishali's Online Bookshop: Forgot Password mail", 
            "<table width='100%' border='0' align='center' cellpadding='0' cellspacing='0' "
                    + "style='font-family:Verdana, Arial, Helvetica, sans-serif; font-size:12pt; color:#5a5a5a;'>"
                    + "<tr><td align='left'><p>Dear " + user.getFirstName() + ",</p></td></tr><tr>"
                    + "<td align='left'><p>As requested, please find your login details below:</p><br/>"
                    + "<br/><p>Username: " + user.getUserName() + "<br />Password: " + user.getPassword() + 
                    "<br /></p><br/><p>Thank you for using  this site.<br /></p><br/><br/><p>"
                    + "Regards,<br />Sharanam & Vaishali's Online Bookshop<br /></p><p><br /><br />"
                    + "THIS IS AN AUTOMATED MESSAGE; PLEASE DO NOT REPLY. </p></td></tr></table>");
            message = "Password sent to " + user.getEmailAddress();
        } else {
            message = "Invalid Username. Please try again";
        }
        map.put("message", message);
        Search search = new Search();
        map.put("search", search);
        return "forgotPassword";
    }
}
