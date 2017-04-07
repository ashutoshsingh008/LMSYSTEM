/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lms.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author 123
 */
public class JasperUtility {
    // filter Names
   private String filterName1="";
   private String filterName2="";
   private String filterName3="";
   private String filterName4="";
   private String filterName5="";
   private String filterName6="";
   private String filterName7="";
   private String filterName8="";
   private String filterName9="";
   private String filterName10="";
   private String filterName11="";
   //Filter Values
   
   private String filterValue1="";
   private String filterValue2="";
   private String filterValue3="";
   private String filterValue4="";
   private String filterValue5="";
   private String filterValue6="";
   private String filterValue7="";
   private String filterValue8="";
   private String filterValue9="";
   private String filterValue10="";
   private String filterValue11="";
   //for below list
   private String belowFilterName1="";
   private String belowFilterName2="";
   private String belowFilterName3="";
   private String belowFilterName4="";
   private String belowFilterName5="";
   private String belowFilterName6="";
   private String belowFilterName7="";
   private String belowFilterName8="";
   private String belowFilterName9="";
   private String belowFilterName10="";
   //Filter Values
   
   private String belowFilterValue1="";
   private String belowFilterValue2="";
   private String belowFilterValue3="";
   private String belowFilterValue4="";
   private String belowFilterValue5="";
   private String belowFilterValue6="";
   private String belowFilterValue7="";
   private String belowFilterValue8="";
   private String belowFilterValue9="";
   private String belowFilterValue10="";
   
   //left filter name
   private String leftFilterName="";
   private String leftFilterValue="";
   //columb Header Name
   
   private String col1="";
   private String col2="";
   private String col3="";
   private String col4="";
   private String col5="";
   private String col6="";
   private String col7="";
   private String col8="";
   private String col9="";
   private String col10="";
   private String col11="";
   private String col12="";
   private String col13="";
   private String col14="";
   private String col15="";
   private String col16="";
   private String col17="";
   private String col18="";
   private String col19="";
   private String col20="";
   private String col21="";
   private String col22="";
   private String col23="";
   private String col24="";
   private String col25="";
   private String col26="";
   private String col27="";
   private String col28="";
   private String col29="";
   private String col30="";
   private String col31="";
   private String col32="";
    private String col33="";
   private String col34="";
   private String col35="";
   private String col36="";
   private String col37="";
   private String col38="";
   private String col39="";
   private String col40="";
   private String col41="";
   private String col42="";
   private String col43="";
   private String col44="";
   private String col45="";
   private String col46="";
   private String col47="";
   private String col48="";
   private String col49="";
   private String col50="";
   private String col51="";
   private String col52="";
   private String col53="";
   private String col54="";
   private String col55="";
  
 
    
     // method for filter name list  for 1
    public List<String> filterNameList1(String filterName1)
    {
      this.filterName1=filterName1;
      List<String> filtNameList = new ArrayList<String>();
      filtNameList.add(filterName1);
       return filtNameList;
      }
    
 
    
     // method for filter name list  for 2
    public List<String> filterNameList2(String filterName1,String filterName2)
    {
        this.filterName1=filterName1;
        this.filterName2=filterName2;
        List<String> filtNameList = new ArrayList<String>();
         
        filtNameList.add(filterName1);
        filtNameList.add(filterName2);
         return filtNameList;
    }
    
    
     // method for filter name list  for 3
    public List<String> filterNameList3(String filterName1,String filterName2,String filterName3)
    {
        this.filterName1=filterName1;
        this.filterName2=filterName2;
        this.filterName3=filterName3;
        List<String> filtNameList = new ArrayList<String>();
         
        filtNameList.add(filterName1);
        filtNameList.add(filterName2);
        filtNameList.add(filterName3);
        return filtNameList;
        
    }
    
     // method for filter name list  for 4
    public List<String> filterNameList4(String filterName1,String filterName2,String filterName3,String filterName4)
    {
        
        
        this.filterName1=filterName1;
        this.filterName2=filterName2;
        this.filterName3=filterName3;
        this.filterName4=filterName4;
        List<String> filtNameList = new ArrayList<String>();
         
        filtNameList.add(filterName1);
        filtNameList.add(filterName2);
        filtNameList.add(filterName3);
        filtNameList.add(filterName4);
        return filtNameList;
    }
    
    
    // method for filter name list  for 5
    public List<String> filterNameList5(String filterName1,String filterName2,String filterName3,String filterName4,
                                       String filterName5)
    {
        this.filterName1=filterName1;
        this.filterName2=filterName2;
        this.filterName3=filterName3;
        this.filterName4=filterName4;
        this.filterName5=filterName5;
        List<String> filtNameList = new ArrayList<String>();
         
        filtNameList.add(filterName1);
        filtNameList.add(filterName2);
        filtNameList.add(filterName3);
        filtNameList.add(filterName4);
        filtNameList.add(filterName5);
       return filtNameList;
    }    
        
    
    
    // method for filter name list  for 6
    public List<String> filterNameList6(String filterName1,String filterName2,String filterName3,String filterName4,
                                       String filterName5,String filterName6)
    {
        this.filterName1=filterName1;
        this.filterName2=filterName2;
        this.filterName3=filterName3;
        this.filterName4=filterName4;
        this.filterName5=filterName5;
        this.filterName6=filterName6;
        List<String> filtNameList = new ArrayList<String>();
         
        filtNameList.add(filterName1);
        filtNameList.add(filterName2);
        filtNameList.add(filterName3);
        filtNameList.add(filterName4);
        filtNameList.add(filterName5);
        filtNameList.add(filterName6);
       return filtNameList;
        
        
    }
    // method for filter name list  for 7
    public List<String> filterNameList7(String filterName1,String filterName2,String filterName3,String filterName4,
                                       String filterName5,String filterName6,String filterName7)
    {
        this.filterName1=filterName1;
        this.filterName2=filterName2;
        this.filterName3=filterName3;
        this.filterName4=filterName4;
        this.filterName5=filterName5;
        this.filterName6=filterName6;
         this.filterName7=filterName7;
        List<String> filtNameList = new ArrayList<String>();
         
        filtNameList.add(filterName1);
        filtNameList.add(filterName2);
        filtNameList.add(filterName3);
        filtNameList.add(filterName4);
        filtNameList.add(filterName5);
        filtNameList.add(filterName6);
        filtNameList.add(filterName7);
       return filtNameList;
        
        
    }
     
    // method for filter name list  for 8
    public List<String> filterNameList8(String filterName1,String filterName2,String filterName3,String filterName4,
                                       String filterName5,String filterName6,String filterName7,String filterName8)
    {
        this.filterName1=filterName1;
        this.filterName2=filterName2;
        this.filterName3=filterName3;
        this.filterName4=filterName4;
        this.filterName5=filterName5;
        this.filterName6=filterName6;
        this.filterName7=filterName7;
        this.filterName8=filterName8;
       List<String> filtNameList = new ArrayList<String>();
         
        filtNameList.add(filterName1);
        filtNameList.add(filterName2);
        filtNameList.add(filterName3);
        filtNameList.add(filterName4);
        filtNameList.add(filterName5);
        filtNameList.add(filterName6);
        filtNameList.add(filterName7);
        filtNameList.add(filterName8);
        return filtNameList;
     }
     
    // method for filter name list  for 9
    public List<String> filterNameList9(String filterName1,String filterName2,String filterName3,String filterName4,
                                       String filterName5,String filterName6,String filterName7,String filterName8,
                                       String filterName9)
    {
        this.filterName1=filterName1;
        this.filterName2=filterName2;
        this.filterName3=filterName3;
        this.filterName4=filterName4;
        this.filterName5=filterName5;
        this.filterName6=filterName6;
        this.filterName7=filterName7;
        this.filterName8=filterName8;
        this.filterName9=filterName9;
        List<String> filtNameList = new ArrayList<String>();
         
        filtNameList.add(filterName1);
        filtNameList.add(filterName2);
        filtNameList.add(filterName3);
        filtNameList.add(filterName4);
        filtNameList.add(filterName5);
        filtNameList.add(filterName6);
        filtNameList.add(filterName7);
        filtNameList.add(filterName8);
        filtNameList.add(filterName9);
        return filtNameList;
    }
    
    // method for filter name list  for 10
    public List<String> filterNameList10(String filterName1,
                                       String filterName2,
                                       String filterName3,
                                       String filterName4,
                                       String filterName5,
                                       String filterName6,
                                       String filterName7,
                                       String filterName8,
                                       String filterName9,
                                       String filterName10
                                       ){
        
        
        this.filterName1=filterName1;
        this.filterName2=filterName2;
        this.filterName3=filterName3;
        this.filterName4=filterName4;
        this.filterName5=filterName5;
        this.filterName6=filterName6;
        this.filterName7=filterName7;
        this.filterName8=filterName8;
        this.filterName9=filterName9;
        this.filterName10=filterName10;
        
        
        
        
        List<String> filtNameList = new ArrayList<String>();
         
        filtNameList.add(filterName1);
        filtNameList.add(filterName2);
        filtNameList.add(filterName3);
        filtNameList.add(filterName4);
        filtNameList.add(filterName5);
        filtNameList.add(filterName6);
        filtNameList.add(filterName7);
        filtNameList.add(filterName8);
        filtNameList.add(filterName9);
        filtNameList.add(filterName10);
        
        
        
        return filtNameList;
        
        
    }
     // method for filter name list  for 10
    public List<String> filterNameList11(String filterName1,
                                       String filterName2,
                                       String filterName3,
                                       String filterName4,
                                       String filterName5,
                                       String filterName6,
                                       String filterName7,
                                       String filterName8,
                                       String filterName9,
                                       String filterName10,
                                       String filterName11
                                       ){
        
        
        this.filterName1=filterName1;
        this.filterName2=filterName2;
        this.filterName3=filterName3;
        this.filterName4=filterName4;
        this.filterName5=filterName5;
        this.filterName6=filterName6;
        this.filterName7=filterName7;
        this.filterName8=filterName8;
        this.filterName9=filterName9;
        this.filterName10=filterName10;
        this.filterName11=filterName11;
        
        
        
        
        List<String> filtNameList = new ArrayList<String>();
         
        filtNameList.add(filterName1);
        filtNameList.add(filterName2);
        filtNameList.add(filterName3);
        filtNameList.add(filterName4);
        filtNameList.add(filterName5);
        filtNameList.add(filterName6);
        filtNameList.add(filterName7);
        filtNameList.add(filterName8);
        filtNameList.add(filterName9);
        filtNameList.add(filterName10);
        filtNameList.add(filterName11);
        
        
        
        return filtNameList;
        
        
    }
    
     // method for filterValue List for 1
    public List<String> filterValueList1(String filterValue1)
    {
     this.filterValue1=filterValue1;
       List<String> filtValueList = new ArrayList<String>();
       filtValueList.add(filterValue1);
       return filtValueList;
     } 
    
    
     // method for filterValue List for 2
    public List<String> filterValueList2(String filterValue1,String filterValue2 ){
        this.filterValue1=filterValue1;
        this.filterValue2=filterValue2;
       List<String> filtValueList = new ArrayList<String>();
         
        filtValueList.add(filterValue1);
        filtValueList.add(filterValue2);
        return filtValueList;
    } 
    
     // method for filterValue List for 3
    public List<String> filterValueList3(String filterValue1,
                                       String filterValue2,
                                       String filterValue3
                                      
                                       ){
        
        
        this.filterValue1=filterValue1;
        this.filterValue2=filterValue2;
        this.filterValue3=filterValue3;
        
        
        
        
        
        List<String> filtValueList = new ArrayList<String>();
         
        filtValueList.add(filterValue1);
        filtValueList.add(filterValue2);
        filtValueList.add(filterValue3);
        
        
        
        return filtValueList;
        
        
    } 
    // method for filterValue List for 4
    public List<String> filterValueList4(String filterValue1,String filterValue2,String filterValue3,String filterValue4){
        
        
        this.filterValue1=filterValue1;
        this.filterValue2=filterValue2;
        this.filterValue3=filterValue3;
        this.filterValue4=filterValue4;
      
        
        
        
        
        List<String> filtValueList = new ArrayList<String>();
         
        filtValueList.add(filterValue1);
        filtValueList.add(filterValue2);
        filtValueList.add(filterValue3);
        filtValueList.add(filterValue4);
       
        return filtValueList;
        
        
    } 
    
    // method for filterValue List for 5
    public List<String> filterValueList5(String filterValue1,String filterValue2,String filterValue3,String filterValue4,
                                       String filterValue5)
    {
        this.filterValue1=filterValue1;
        this.filterValue2=filterValue2;
        this.filterValue3=filterValue3;
        this.filterValue4=filterValue4;
        this.filterValue5=filterValue5;
        List<String> filtValueList = new ArrayList<String>();
         
        filtValueList.add(filterValue1);
        filtValueList.add(filterValue2);
        filtValueList.add(filterValue3);
        filtValueList.add(filterValue4);
        filtValueList.add(filterValue5);
       return filtValueList;
        
        
    } 
    // method for filterValue List for 6
    public List<String> filterValueList6(String filterValue1,String filterValue2,String filterValue3,String filterValue4,
                                       String filterValue5,String filterValue6)
    {
        this.filterValue1=filterValue1;
        this.filterValue2=filterValue2;
        this.filterValue3=filterValue3;
        this.filterValue4=filterValue4;
        this.filterValue5=filterValue5;
        this.filterValue6=filterValue6;
        List<String> filtValueList = new ArrayList<String>();
         
        filtValueList.add(filterValue1);
        filtValueList.add(filterValue2);
        filtValueList.add(filterValue3);
        filtValueList.add(filterValue4);
        filtValueList.add(filterValue5);
        filtValueList.add(filterValue6);
        return filtValueList;
        
        
    } 
    // method for filterValue List for 7
    public List<String> filterValueList7(String filterValue1,String filterValue2,String filterValue3,String filterValue4,
                                       String filterValue5,String filterValue6,String filterValue7)
    {
        this.filterValue1=filterValue1;
        this.filterValue2=filterValue2;
        this.filterValue3=filterValue3;
        this.filterValue4=filterValue4;
        this.filterValue5=filterValue5;
        this.filterValue6=filterValue6;
        this.filterValue7=filterValue7;
        
        List<String> filtValueList = new ArrayList<String>();
        filtValueList.add(filterValue1);
        filtValueList.add(filterValue2);
        filtValueList.add(filterValue3);
        filtValueList.add(filterValue4);
        filtValueList.add(filterValue5);
        filtValueList.add(filterValue6);
        filtValueList.add(filterValue7);
       return filtValueList;
    } 
    // method for filterValue List for 8
    public List<String> filterValueList8(String filterValue1,String filterValue2,String filterValue3,String filterValue4,
                                       String filterValue5,String filterValue6,String filterValue7,String filterValue8)
    {
        this.filterValue1=filterValue1;
        this.filterValue2=filterValue2;
        this.filterValue3=filterValue3;
        this.filterValue4=filterValue4;
        this.filterValue5=filterValue5;
        this.filterValue6=filterValue6;
        this.filterValue7=filterValue7;
        this.filterValue8=filterValue8;
      List<String> filtValueList = new ArrayList<String>();
         
        filtValueList.add(filterValue1);
        filtValueList.add(filterValue2);
        filtValueList.add(filterValue3);
        filtValueList.add(filterValue4);
        filtValueList.add(filterValue5);
        filtValueList.add(filterValue6);
        filtValueList.add(filterValue7);
        filtValueList.add(filterValue8);
        return filtValueList;
    } 
    // method for filterValue List for 9
    public List<String> filterValueList9(String filterValue1,String filterValue2,String filterValue3,String filterValue4,
                                       String filterValue5,String filterValue6,String filterValue7,String filterValue8,
                                       String filterValue9){
        
        
        this.filterValue1=filterValue1;
        this.filterValue2=filterValue2;
        this.filterValue3=filterValue3;
        this.filterValue4=filterValue4;
        this.filterValue5=filterValue5;
        this.filterValue6=filterValue6;
        this.filterValue7=filterValue7;
        this.filterValue8=filterValue8;
        this.filterValue9=filterValue9;
       List<String> filtValueList = new ArrayList<String>();
         
        filtValueList.add(filterValue1);
        filtValueList.add(filterValue2);
        filtValueList.add(filterValue3);
        filtValueList.add(filterValue4);
        filtValueList.add(filterValue5);
        filtValueList.add(filterValue6);
        filtValueList.add(filterValue7);
        filtValueList.add(filterValue8);
        filtValueList.add(filterValue9);
       return filtValueList;
    } 
    
    // method for filterValue List for 10
    public List<String> filterValueList10(String filterValue1, String filterValue2,String filterValue3, String filterValue4,
                                       String filterValue5, String filterValue6,String filterValue7,String filterValue8,
                                       String filterValue9,String filterValue10 )
    {
        this.filterValue1=filterValue1;
        this.filterValue2=filterValue2;
        this.filterValue3=filterValue3;
        this.filterValue4=filterValue4;
        this.filterValue5=filterValue5;
        this.filterValue6=filterValue6;
        this.filterValue7=filterValue7;
        this.filterValue8=filterValue8;
        this.filterValue9=filterValue9;
        this.filterValue10=filterValue10;
        List<String> filtValueList = new ArrayList<String>();
         
        filtValueList.add(filterValue1);
        filtValueList.add(filterValue2);
        filtValueList.add(filterValue3);
        filtValueList.add(filterValue4);
        filtValueList.add(filterValue5);
        filtValueList.add(filterValue6);
        filtValueList.add(filterValue7);
        filtValueList.add(filterValue8);
        filtValueList.add(filterValue9);
        filtValueList.add(filterValue10);
        return filtValueList;
        
        
    } 
    
    // method for filterValue List for 10
    public List<String> filterValueList11(String filterValue1, String filterValue2,String filterValue3, String filterValue4,
                                       String filterValue5, String filterValue6,String filterValue7,String filterValue8,
                                       String filterValue9,String filterValue10,String filterValue11 )
    {
        this.filterValue1=filterValue1;
        this.filterValue2=filterValue2;
        this.filterValue3=filterValue3;
        this.filterValue4=filterValue4;
        this.filterValue5=filterValue5;
        this.filterValue6=filterValue6;
        this.filterValue7=filterValue7;
        this.filterValue8=filterValue8;
        this.filterValue9=filterValue9;
        this.filterValue10=filterValue10;
         this.filterValue11=filterValue11;
        List<String> filtValueList = new ArrayList<String>();
         
        filtValueList.add(filterValue1);
        filtValueList.add(filterValue2);
        filtValueList.add(filterValue3);
        filtValueList.add(filterValue4);
        filtValueList.add(filterValue5);
        filtValueList.add(filterValue6);
        filtValueList.add(filterValue7);
        filtValueList.add(filterValue8);
        filtValueList.add(filterValue9);
        filtValueList.add(filterValue10);
        filtValueList.add(filterValue11); 
        return filtValueList;
        
        
    } 
    
      
    // column header name list    for 1
     public List<String> columnHeaderList1(String col1)
     {
        this.col1=col1;
        
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
     
       
        return columnHeaderList;
      } 
     // column header name list    for 2
     public List<String> columnHeaderList2(String col1,String col2)
     {
        this.col1=col1;
        this.col2=col2;
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
       
        return columnHeaderList;
      } 
     
     // column header name list    for 3
     
       public List<String> columnHeaderList3(String col1, String col2, String col3){
        
           this.col1=col1;
           this.col2=col2;
           this.col3=col3;
       List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        return columnHeaderList;
     }
    
    
    
    
    
    
  // column header name list    for 4
     public List<String> columnHeaderList4(String col1,String col2,String col3,String col4){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
         List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
       return columnHeaderList;
     } 
     // column header name list    for 5
     public List<String> columnHeaderList5(String col1,String col2,String col3,String col4,
                                       String col5){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
       List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        return columnHeaderList;
      } 
     // column header name list    for 6
     public List<String> columnHeaderList6(String col1,String col2,String col3,String col4, String col5,String col6){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
       List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
         return columnHeaderList;
     } 
     // column header name list    for 7
     public List<String> columnHeaderList7(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
     List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
       return columnHeaderList;
        
        
    } 
// column header name list    for 8
     public List<String> columnHeaderList8(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        
        
        
        
        
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        
        
        
       
        return columnHeaderList;
        
        
    } 
     // column header name list    for 9
     public List<String> columnHeaderList9(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        
        return columnHeaderList;
       
    } 
      
       // column header name list    for 10
     public List<String> columnHeaderList10(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
         columnHeaderList.add(col10);
        
        return columnHeaderList;
       
    }  
    
   // column header name list    for 11
     public List<String> columnHeaderList11(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col1=col11;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        return columnHeaderList;
       
    }  
   
     
      
      // column header name list    for 12
     public List<String> columnHeaderList12(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        return columnHeaderList;
       
    } 
      // column header name list    for 13
     public List<String> columnHeaderList13(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        return columnHeaderList;
       
    } 
      // column header name list    for 14
     public List<String> columnHeaderList14(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        return columnHeaderList;
       
    } 
      // column header name list    for 15
     public List<String> columnHeaderList15(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        return columnHeaderList;
       
    } 
      // column header name list    for 16
     public List<String> columnHeaderList16(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        return columnHeaderList;
       
    } 
     
      //---- Common purpose Method Column headername will come in string and it will split them.
      public List<String> columnHeaderList(String dataString){
        
        StringTokenizer strToken=new StringTokenizer(dataString,",");
      
        List<String> columnHeaderList = new ArrayList<String>();
        
        while(strToken.hasMoreTokens())
        {
            columnHeaderList.add(strToken.nextToken());
        }
        return columnHeaderList;
       
    }
       //code for parameter list which will show after list
      public List<String> belowFilterNameList(String belowFilterName1,String belowFilterName2,String belowFilterName3)
    {
        this.belowFilterName1=belowFilterName1;
        this.belowFilterName2=belowFilterName2;
        this.belowFilterName3=belowFilterName3;
        List<String> beloWFiltNameList = new ArrayList<String>();
         
        beloWFiltNameList.add(belowFilterName1);
        beloWFiltNameList.add(belowFilterName2);
        beloWFiltNameList.add(belowFilterName3);
        return beloWFiltNameList;
        
    }
       public List<String> belowFilterNameList(String belowFilterName1)
    {
        this.belowFilterName1=belowFilterName1;
        
        List<String> beloWFiltNameList = new ArrayList<String>();
         
        beloWFiltNameList.add(belowFilterName1);
      
        return beloWFiltNameList;
        
    }
        public List<String> belowFilterNameList(String belowFilterName1,String belowFilterName2)
    {
        this.belowFilterName1=belowFilterName1;
        this.belowFilterName2=belowFilterName2;
        
        List<String> beloWFiltNameList = new ArrayList<String>();
         
        beloWFiltNameList.add(belowFilterName1);
        beloWFiltNameList.add(belowFilterName2);
       
        return beloWFiltNameList;
        
    }
        public List<String> belowFilterValueList(String belowFilterValue1
                                       )
      {
        
        
        this.belowFilterValue1=belowFilterValue1;
       
        
       List<String> belowFiltValueList = new ArrayList<String>();
         
        belowFiltValueList.add(belowFilterValue1);
       
        
        
        
        return belowFiltValueList;
        
        
    } 
        public List<String> belowFilterValueList(String belowFilterValue1,
                                       String belowFilterValue2
                                      
                                       )
      {
        
        
        this.belowFilterValue1=belowFilterValue1;
        this.belowFilterValue2=belowFilterValue1;
       
        
       List<String> belowFiltValueList = new ArrayList<String>();
         
        belowFiltValueList.add(belowFilterValue1);
        belowFiltValueList.add(belowFilterValue2);
       
        
        
        
        return belowFiltValueList;
        
        
    } 
      public List<String> belowFilterValueList(String belowFilterValue1,
                                       String belowFilterValue2,
                                       String belowFilterValue3
                                      
                                       )
      {
        
        
        this.belowFilterValue1=belowFilterValue1;
        this.belowFilterValue2=belowFilterValue1;
        this.belowFilterValue3=belowFilterValue1;
        
       List<String> belowFiltValueList = new ArrayList<String>();
         
        belowFiltValueList.add(belowFilterValue1);
        belowFiltValueList.add(belowFilterValue2);
        belowFiltValueList.add(belowFilterValue3);
        
        
        
        return belowFiltValueList;
        
        
    } 
  //list for left filtername
       public List<String> leftFilterNameList(String leftFilterName)
      {
      this.leftFilterName=leftFilterName;
      List<String> leftfiltNameList = new ArrayList<String>();
      leftfiltNameList.add(leftFilterName);
       return leftfiltNameList;
      }
               //list for left filter Value
       public List<String> leftFilterValueList(String leftFilterValue)
      {
      this.leftFilterValue=leftFilterValue;
      List<String> leftFilterValueList = new ArrayList<String>();
      leftFilterValueList.add(leftFilterValue);
       return leftFilterValueList;
      }
     
 public List<String> columnHeaderList17(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
         columnHeaderList.add(col17);
        return columnHeaderList;
       
    }  
 public List<String> columnHeaderList18(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        return columnHeaderList;
       
    }  
   
 public List<String> columnHeaderList19(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        return columnHeaderList;
       
    }  
 
 public List<String> columnHeaderList20(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col19=col20;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        return columnHeaderList;
       
    }  
 public List<String> columnHeaderList21(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20,String col21){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        return columnHeaderList;
       
    }  
 public List<String> columnHeaderList22(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        return columnHeaderList;
       
    }  
 public List<String> columnHeaderList23(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        return columnHeaderList;
       
    }
 public List<String> columnHeaderList24(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        return columnHeaderList;
       
    }
 public List<String> columnHeaderList25(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        return columnHeaderList;
       
    }
  public List<String> columnHeaderList26(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        return columnHeaderList;
       
    }
  
   public List<String> columnHeaderList27(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        return columnHeaderList;
       
    }
    public List<String> columnHeaderList28(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        return columnHeaderList;
       
    }
     public List<String> columnHeaderList29(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        return columnHeaderList;
       
    }
     public List<String> columnHeaderList30(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
         columnHeaderList.add(col30);
        return columnHeaderList;
       
    }
     public List<String> columnHeaderList31(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31;         
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        return columnHeaderList;
       
    }
     public List<String> columnHeaderList32(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31;  
        this.col32=col32; 
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
         columnHeaderList.add(col32);
        return columnHeaderList;
       
    }
     public List<String> columnHeaderList33(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31;
        this.col32=col32;
        this.col33=col33;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        return columnHeaderList;
       
    }
     public List<String> columnHeaderList34(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31;
        this.col32=col32;
        this.col33=col33;
        this.col34=col34;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
           
        return columnHeaderList;
       
    }
     public List<String> columnHeaderList35(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32;
        this.col33=col33; 
        this.col34=col34;
        this.col35=col35; 
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        return columnHeaderList;
       
    }
     public List<String> columnHeaderList36(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36; 
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        
        return columnHeaderList;
       
    }
     
     public List<String> columnHeaderList37(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        
        return columnHeaderList;
       
    } 
     public List<String> columnHeaderList38(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,
                                       String col28,
                                       String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        
        return columnHeaderList;
       
    } 
     public List<String> columnHeaderList39(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        
        return columnHeaderList;
       
    } 
      public List<String> columnHeaderList40(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        
        return columnHeaderList;
       
    } 
       public List<String> columnHeaderList41(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        
        return columnHeaderList;
       
    } 
       public List<String> columnHeaderList42(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        
        return columnHeaderList;
       
    } 
        public List<String> columnHeaderList43(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        
        return columnHeaderList;
       
    } 
         public List<String> columnHeaderList44(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        
        return columnHeaderList;
       
    } 
    public List<String> columnHeaderList45(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
         columnHeaderList.add(col45);
        
        return columnHeaderList;
       
    } 
  public List<String> columnHeaderList46(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45,String col46){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
        this.col46=col46;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        columnHeaderList.add(col46);
        
        return columnHeaderList;
       
    } 
   public List<String> columnHeaderList47(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45,String col46
                                       ,String col47){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
        this.col46=col46;
        this.col47=col47;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        columnHeaderList.add(col46);
        columnHeaderList.add(col47);
        
        return columnHeaderList;
       
    }
    public List<String> columnHeaderList48(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45,String col46
                                       ,String col47,String col48){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
        this.col46=col46;
        this.col47=col47;
        this.col48=col48;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        columnHeaderList.add(col46);
        columnHeaderList.add(col47);
        columnHeaderList.add(col48);
        
        return columnHeaderList;
       
    }
     public List<String> columnHeaderList49(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45,String col46
                                       ,String col47,String col48,String col49){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
        this.col46=col46;
        this.col47=col47;
        this.col48=col48;
        this.col49=col49;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        columnHeaderList.add(col46);
        columnHeaderList.add(col47);
        columnHeaderList.add(col48);
        columnHeaderList.add(col49);
        
        return columnHeaderList;
       
    }
      public List<String> columnHeaderList50(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45,String col46
                                       ,String col47,String col48,String col49,String col50){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
        this.col46=col46;
        this.col47=col47;
        this.col48=col48;
        this.col49=col49;
        this.col50=col50;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        columnHeaderList.add(col46);
        columnHeaderList.add(col47);
        columnHeaderList.add(col48);
        columnHeaderList.add(col49);
        columnHeaderList.add(col50);
        
        return columnHeaderList;
       
    }
   public List<String> columnHeaderList51(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45,String col46
                                       ,String col47,String col48,String col49,String col50,String col51){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
        this.col46=col46;
        this.col47=col47;
        this.col48=col48;
        this.col49=col49;
        this.col50=col50;
        this.col51=col51;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        columnHeaderList.add(col46);
        columnHeaderList.add(col47);
        columnHeaderList.add(col48);
        columnHeaderList.add(col49);
        columnHeaderList.add(col50);
        columnHeaderList.add(col51);
        
        return columnHeaderList;
       
    } 
     public List<String> columnHeaderList52(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45,String col46
                                       ,String col47,String col48,String col49,String col50,String col51,String col52){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
        this.col46=col46;
        this.col47=col47;
        this.col48=col48;
        this.col49=col49;
        this.col50=col50;
        this.col51=col51;
        this.col52=col52;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        columnHeaderList.add(col46);
        columnHeaderList.add(col47);
        columnHeaderList.add(col48);
        columnHeaderList.add(col49);
        columnHeaderList.add(col50);
        columnHeaderList.add(col51);
        columnHeaderList.add(col52);
        
        return columnHeaderList;
       
    } 
      public List<String> columnHeaderList53(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col28,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45,String col46
                                       ,String col47,String col48,String col49,String col50,String col51,String col52,String col53){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
        this.col46=col46;
        this.col47=col47;
        this.col48=col48;
        this.col49=col49;
        this.col50=col50;
        this.col51=col51;
        this.col52=col52;
        this.col53=col53;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        columnHeaderList.add(col46);
        columnHeaderList.add(col47);
        columnHeaderList.add(col48);
        columnHeaderList.add(col49);
        columnHeaderList.add(col50);
        columnHeaderList.add(col51);
        columnHeaderList.add(col52);
        columnHeaderList.add(col53);
        
        return columnHeaderList;
       
    } 
       public List<String> columnHeaderList54(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45,String col46
                                       ,String col47,String col48,String col49,String col50,String col51,String col52,String col53,String col54){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
        this.col46=col46;
        this.col47=col47;
        this.col48=col48;
        this.col49=col49;
        this.col50=col50;
        this.col51=col51;
        this.col52=col52;
        this.col53=col53;
        this.col54=col54;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        columnHeaderList.add(col46);
        columnHeaderList.add(col47);
        columnHeaderList.add(col48);
        columnHeaderList.add(col49);
        columnHeaderList.add(col50);
        columnHeaderList.add(col51);
        columnHeaderList.add(col52);
        columnHeaderList.add(col53);
        columnHeaderList.add(col54);
        
        return columnHeaderList;
       
    } 
        public List<String> columnHeaderList55(String col1,String col2,String col3,String col4,
                                       String col5,String col6,String col7,String col8,String col9,String col10,
                                       String col11,String col12,String col13,String col14,String col15,String col16,String col17,String col18,String col19,String col20
                                       ,String col21,String col22,String col23,String col24,String col25,String col26,String col27,String col29,String col30,String col31,String col32,String col33,String col34,String col35,String col36,String col37
                                       ,String col38,String col39,String col40,String col41,String col42,String col43,String col44,String col45,String col46
                                       ,String col47,String col48,String col49,String col50,String col51,String col52,String col53,String col54,String col55){
        
        
        this.col1=col1;
        this.col2=col2;
        this.col3=col3;
        this.col4=col4;
        this.col5=col5;
        this.col6=col6;
        this.col7=col7;
        this.col8=col8;
        this.col9=col9;
        this.col10=col10;
        this.col11=col11;
        this.col12=col12;
        this.col13=col13;
        this.col14=col14;
        this.col15=col15;
        this.col16=col16;
        this.col17=col17;
        this.col18=col18;
        this.col19=col19;
        this.col20=col20;
        this.col21=col21;
        this.col22=col22;
        this.col23=col23;
        this.col24=col24;
        this.col25=col25;
        this.col26=col26;
        this.col27=col27;
        this.col28=col28;
        this.col29=col29;
        this.col30=col30;
        this.col31=col31; 
        this.col32=col32; 
        this.col33=col33; 
        this.col34=col34; 
        this.col35=col35; 
        this.col36=col36;
        this.col37=col37;
        this.col38=col38;
        this.col39=col39;
        this.col40=col40;
        this.col41=col41;
        this.col42=col42;
        this.col43=col43;
        this.col44=col44;
        this.col45=col45;
        this.col46=col46;
        this.col47=col47;
        this.col48=col48;
        this.col49=col49;
        this.col50=col50;
        this.col51=col51;
        this.col52=col52;
        this.col53=col53;
        this.col54=col54;
        this.col55=col55;
      
        List<String> columnHeaderList = new ArrayList<String>();
         
        columnHeaderList.add(col1);
        columnHeaderList.add(col2);
        columnHeaderList.add(col3);
        columnHeaderList.add(col4);
        columnHeaderList.add(col5);
        columnHeaderList.add(col6);
        columnHeaderList.add(col7);
        columnHeaderList.add(col8);
        columnHeaderList.add(col9);
        columnHeaderList.add(col10);
        columnHeaderList.add(col11);
        columnHeaderList.add(col12);
        columnHeaderList.add(col13);
        columnHeaderList.add(col14);
        columnHeaderList.add(col15);
        columnHeaderList.add(col16);
        columnHeaderList.add(col17);
        columnHeaderList.add(col18);
        columnHeaderList.add(col19);
        columnHeaderList.add(col20);
        columnHeaderList.add(col21);
        columnHeaderList.add(col22);
        columnHeaderList.add(col23);
        columnHeaderList.add(col24);
        columnHeaderList.add(col25);
        columnHeaderList.add(col26);
        columnHeaderList.add(col27);
        columnHeaderList.add(col28);
        columnHeaderList.add(col29);
        columnHeaderList.add(col30);
        columnHeaderList.add(col31);
        columnHeaderList.add(col32);
        columnHeaderList.add(col33);
        columnHeaderList.add(col34);
        columnHeaderList.add(col35);
        columnHeaderList.add(col36);
        columnHeaderList.add(col37);
        columnHeaderList.add(col38);
        columnHeaderList.add(col39);
        columnHeaderList.add(col40);
        columnHeaderList.add(col41);
        columnHeaderList.add(col42);
        columnHeaderList.add(col43);
        columnHeaderList.add(col44);
        columnHeaderList.add(col46);
        columnHeaderList.add(col47);
        columnHeaderList.add(col48);
        columnHeaderList.add(col49);
        columnHeaderList.add(col50);
        columnHeaderList.add(col51);
        columnHeaderList.add(col52);
        columnHeaderList.add(col53);
        columnHeaderList.add(col54);
        columnHeaderList.add(col55);
        
        return columnHeaderList;
       
    } 
}
