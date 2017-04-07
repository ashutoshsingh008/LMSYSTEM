package com.lms.controllers;


import java.util.*;
import com.lms.service.ItemSubCatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.lms.model.ItemSubCat;

import java.io.File;
import java.io.FileInputStream;

import org.hibernate.SessionFactory;
import java.util.regex.Pattern;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Controller
@RequestMapping("/admin/Inventory/")
public class ItemSubCatController {
    
    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    private ItemSubCatService itemSubCatService;
    //Session session = HibernateUtil.getSessionFactory().openSession();
    
    JRBeanCollectionDataSource dataSource;
    String folderContextPath = null;
    
    @RequestMapping("/manageItemSubCategory")
    //@RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
    public String showAllItemSubCat(Map<String, Object> map) {
    List<ItemSubCat> subCat = itemSubCatService.listAllItemSubCat();
    map.put("itemSubCatList", subCat);      		
    return "manageItemSubCategory";
    }
 
    
//    @RequestMapping("/catSubCatMap/{value}")
//    public String catSubCatMap(Map<String, Object> map, @PathVariable("value") String value){
//    ItemCatSubCatMap itemCatSubCatMap=new ItemCatSubCatMap(); 
//    //itemCatSubCatMap.setItemCatId(5);
//    //itemCatSubCatMap.setItemSubCatId(11);    
//
//        Pattern ptn1 = Pattern.compile("(vb)");
//        String[] parts1 = ptn1.split(value);
//        
//        for(String p1:parts1){  
//        String[] parts = p1.split("ac");
//        int catId = Integer.parseInt(parts[0]);
//        int subCatId = Integer.parseInt(parts[1]);
//        itemCatSubCatMap.setItemCatId(catId);
//        itemCatSubCatMap.setItemSubCatId(subCatId);
//        itemSubCatService.saveItemCatSubCatMap(itemCatSubCatMap);
//        }
//  
//    
// 
//    return "catSubCatMap";
//    }
   
                

            
            
    @RequestMapping("/getExcelItemSubCategory")
    public String getExcelItemSubCategory(Map<String, Object> map) {
    List<ItemSubCat> subCat = itemSubCatService.listAllItemSubCat();
    map.put("itemSubCatList", subCat); 
    //ExcelWriterUtils.creatResultExcelSheet(subCat);    	
    return "manageItemSubCategory";
    }
    
    
    @RequestMapping("/deleteItemSubCategory/{itemSubCatId}")    
    public String deleteItemSubCategory(Map<String, Object> map, @PathVariable("itemSubCatId") Integer itemSubCatId) {
    itemSubCatService.removeItemSubCat(itemSubCatId);
    return "redirect:/admin/Inventory/manageItemSubCategory";
  
    }  

 
@RequestMapping("/getPdfItemSubCategory")
public String JasperCompileUitil(Map<String, Object> parameters, HttpServletRequest request, HttpServletResponse response) {

    List<ItemSubCat> subCat = itemSubCatService.listAllItemSubCat();
       
    parameters.put("itemSubCatList", subCat); 
  
    folderContextPath = request.getSession().getServletContext().getRealPath("/");


    try {
    
     if (subCat != null) {
        dataSource = new JRBeanCollectionDataSource(subCat);
     }
        
        String jrxmlFileName = folderContextPath + "/jasper/test1.jrxml";
        String jasperFileName = folderContextPath + "/jasper/test1.jasper";
        String pdfFileName = folderContextPath + "/jasper/test1.pdf";


        JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);
        JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, parameters, dataSource);
        // Export pdf file
        JasperExportManager.exportReportToPdfFile(jprint, pdfFileName);
        downLoadJasper(response,"test1.pdf");
 
        
      } catch (Exception e) {
        e.printStackTrace();
      }
        
  return null;  
}   
    
  

public void downLoadJasper(HttpServletResponse response,String downLoadFileName) {
        try {
            File sourceFile = new File(folderContextPath + "/jasper/"+ downLoadFileName);
            FileInputStream fin = new FileInputStream(sourceFile);
            ServletOutputStream outStream = response.getOutputStream();
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment;filename=" +
            downLoadFileName + ".pdf");
            byte[] buffer = new byte[1024];
            int n = 0;
            while ((n = fin.read(buffer)) != -1) {
                outStream.write(buffer, 0, n);
            }
            outStream.close();
            fin.close();
            response.flushBuffer();
        } catch (Exception e) { 
            e.printStackTrace();
        }
                                                           
     }     


    
    
}
    