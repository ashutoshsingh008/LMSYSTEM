
package com.lms.exception;

public class UserException extends RuntimeException{
   private String exceptionMsg;
   
   public UserException(String exceptionMsg) {
      this.exceptionMsg = exceptionMsg;
   }
   
   public String getExceptionMsg(){
      return this.exceptionMsg;
   }
   
   public void setExceptionMsg(String exceptionMsg) {
      this.exceptionMsg = exceptionMsg;
   }
}