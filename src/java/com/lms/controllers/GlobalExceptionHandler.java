package com.lms.controllers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice

public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
        

	
	@ExceptionHandler(IOException.class)
	public String handleSQLException(IOException ex){
		//logger.info("SQLException Occured:: URL="+request.getRequestURL());
                System.out.println("Handling EXCEPTION EAT G+++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Exception thrown  :" + ex);
		return "error";
	}
        
        
        @ExceptionHandler(ArithmeticException.class)
	public String handleSQLException1(HttpServletRequest request, ArithmeticException ex){
		//logger.info("SQLException Occured:: URL="+request.getRequestURL());
                System.out.println("Handling EXCEPTION EAT G ArithmeticException+++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Exception thrown  :" + ex);
                Map<String, String> countryCapitalList = new HashMap<String, String>();
                countryCapitalList.put("United States", "Washington DC");
                countryCapitalList.put("India", "Delhi");
                countryCapitalList.put("Germany", "Berlin");
                countryCapitalList.put("France", "Paris");
                countryCapitalList.put("Italy", "Rome");

                request.setAttribute("capitalList", countryCapitalList);
                
		return "error";
	}
	
        
        @ExceptionHandler(ConstraintViolationException.class)
	public String constraintViolationException(ConstraintViolationException  ex){
		//logger.info("SQLException Occured:: URL="+request.getRequestURL());
                System.out.println("Handling EXCEPTION EAT G ConstraintViolationException ---------- ");
                Map<String, Object> map = new HashMap<String, Object>();
                
                System.out.println("Exception thrown  :" + ex);
                map.put("dbError", "Great");
            
                return "error";
	}
        
        
 
        
        
}