package com.lms.aop;

import com.lms.model.ManageHostel;
import java.util.Iterator;
import java.util.List;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class Logging {

   @Pointcut("execution(* com.lms.service.ManageHostelServiceImpl.listAllHostel(..))")
   private void selectAll(){}


   @Before("selectAll()")
   public void beforeAdvice(){
      System.out.println("..................Before Advice................");
   }


   @After("selectAll()")
   public void afterAdvice(){
      System.out.println("..................After Advice................");
   }

   @AfterReturning(pointcut = "selectAll()", returning="retVal")
   public void afterReturningAdvice(List<ManageHostel> retVal){             
   Iterator<ManageHostel> iterator = retVal.iterator();
   while(iterator.hasNext()){     
   ManageHostel hostel = iterator.next();
   System.out.println("Hostel Name:"+ hostel.getHostel_name());     
   } 
   
   
   
   
   }
   
   
   
   
   
   

   
   
   
   
   
   
   
   
   
   
   /** 
    * This is the method which I would like to execute
    * when any method returns.
    */
   //@AfterReturning(pointcut = "selectAll()", returning="retVal")
   //public void afterReturningAdvice(Object retVal){
   //   System.out.println("Returning:" + retVal.toString() );
   //}

   /**
    * This is the method which I would like to execute
    * if there is an exception raised by any method.
    */
   //@AfterThrowing(pointcut = "selectAll()", throwing = "ex")
  // public void AfterThrowingAdvice(IllegalArgumentException ex){
    //  System.out.println("There has been an exception: " + ex.toString());   
   //}
        
        
        
        
        
        
        
        
        
        
        
}
