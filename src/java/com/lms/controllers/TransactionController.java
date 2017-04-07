package com.lms.controllers;

import com.lms.service.TransactionService;
import com.lms.service.UserService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/manageTransactions")
    public String showManageTransactions(Map<String, Object> map) {
        if(SecurityContextHolder.getContext().getAuthentication().isAuthenticated()) {
            map.put("userDetails", userService.getUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName()));
        }
        return "manageTransactions";
    }
    
    
    @RequestMapping("/aminHome")
    public String showAdminHome() {
        return "aminHome";
    }
  
    
    
    @RequestMapping("/searchTransactionsByUsername")
    public String showTransactions(Map<String, Object> map) {
        map.put("transactionGroupedList", transactionService.listGroupedTransactions());
        map.put("transactionList", transactionService.listTransactions());
        return "manageTransactions";
    }

    @RequestMapping("/searchTransactionsByUsername/{userName}")
    public String showTransactionsByUsername(Map<String, Object> map, @PathVariable("userName") String userName) {
        map.put("transactionGroupedList", transactionService.listGroupedTransactionsByUsername(userName));
        map.put("transactionList", transactionService.listTransactionsByUsername(userName));
        return "manageTransactions";
    }

    @RequestMapping("/searchTransactionsByDate/{year}/{month}/{day}")
    public String showTransactionsByDate(Map<String, Object> map, @PathVariable("day") String day, @PathVariable("year") String year, @PathVariable("month") String month) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            map.put("transactionGroupedList", transactionService.listGroupedTransactionsByDate(sdf.parse(year + "-" + month + "-" + day)));
            map.put("transactionList", transactionService.listTransactionsByDate(sdf.parse(year + "-" + month + "-" + day)));
        } catch (ParseException ex) {
            Logger.getLogger(TransactionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "manageTransactions";
    }

    @RequestMapping("/updateGoogleOrderNo/{transactionNo}/{orderNo}")
    public String updateGoogleOrderNo(Map<String, Object> map, @PathVariable("transactionNo") Integer transactionNo, @PathVariable("orderNo") String orderNo) {
        transactionService.updateGoogleOrderNo(transactionNo, orderNo);
        return "manageTransactions";
    }
}
