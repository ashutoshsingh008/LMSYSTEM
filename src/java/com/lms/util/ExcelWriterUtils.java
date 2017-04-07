package com.lms.util;


import java.io.File;
import java.io.FileOutputStream;
//import org.apache.poi.hssf.util.HSSFColor;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFCellStyle;
//import org.apache.poi.xssf.usermodel.XSSFFont;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.List;
import java.io.File;

import com.lms.model.ItemSubCat;
public class ExcelWriterUtils {

	/*public static void creatResultExcelSheet(List<ItemSubCat> itemSubCatList) {
        //public static void creatResultExcelSheet() {
		
       try {
            XSSFWorkbook workbook = new XSSFWorkbook(); 
            XSSFSheet spreadsheet = workbook.createSheet("Text direction");
            XSSFRow row = spreadsheet.createRow(2);
            XSSFCellStyle myStyle = workbook.createCellStyle();
            XSSFCell cell;

            //30 degrees
            //myStyle=workbook.createCellStyle();
            //myStyle.setRotation((short) 30);
            //cell = row.createCell(3);
            //cell.setCellValue("30D angle");
            //cell.setCellStyle(myStyle);


            //0 degrees
            //myStyle.setRotation((short) 0);
            //XSSFCell cell = row.createCell(1);
            //cell.setCellValue("0D angle");
            //cell.setCellStyle(myStyle);


            
            int i=2;
            if(itemSubCatList != null) {
            for(ItemSubCat ed : itemSubCatList) {
                row=spreadsheet.createRow(i);
                cell=row.createCell(1);
                cell.setCellValue(i);
                cell=row.createCell(2);
                cell.setCellValue(ed.getItemSubCatName());  
                i++;
            }

            }

            
            
            
            
            
            
            
            
            
            


            FileOutputStream out = new FileOutputStream(new File("D:/textdirection.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("textdirection.xlsx written successfully");              
	 }catch (Exception ex) {
            System.out.println("Paramjeet" + ex);
	 }
    	
	}
        * /*
        */
}
