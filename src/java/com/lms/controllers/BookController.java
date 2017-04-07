package com.lms.controllers;
import com.lms.model.Book;
import com.lms.service.*;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin")
public class BookController {
    @Autowired
    private CommonService commonService;
    
    @Autowired
    private BookService bookService;

    @Autowired
    private PublisherService publisherService;
    
    @Autowired
    private CategoryService categoryService;
    
    @Autowired
    private AuthorService authorService;

//    @RequestMapping("/manageBooks")
//    public String showManageBooks(Map<String, Object> map) {
//        map.put("book", new Book());
//        map.put("bookList", bookService.listBook());
//        map.put("publisherList", publisherService.listPublisher());
//        map.put("categoryList", categoryService.listCategory());
//        map.put("authorList", authorService.listAuthor());
//        return "manageBooks";
//    }

    
    @RequestMapping("/manageBooks")
    public String showManageBooks(Model model) {
        //map.put("book", new Book());
        model.addAttribute("book", new Book());
        return "manageBooks";
    }   
    
    @RequestMapping("/downloadBookPhotograph/{bookNo}")
    public String downloadBookPhotograph(@PathVariable("bookNo") Integer bookNo, HttpServletResponse response) {
        Book book = bookService.getBookById(bookNo);
        try {
            if (book.getCoverPage()!=null) {
                response.setHeader("Content-Disposition", "inline;filename=\"" +book.getBookName()+ "\"");
                OutputStream out = response.getOutputStream();
                response.setContentType("image/gif");
                IOUtils.copy(book.getCoverPage().getBinaryStream(), out);
                out.flush();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return null;
    }

    @RequestMapping("/downloadBookTOC/{bookNo}")
    public String downloadBookTOC(@PathVariable("bookNo") Integer bookNo, HttpServletResponse response) {
        Book book = bookService.getBookById(bookNo);
        try {
            if (book.getToc()!=null) {
                response.setHeader("Content-Disposition", "inline;filename=\"" +book.getBookName()+ "\"");
                OutputStream out = response.getOutputStream();
                response.setContentType("application/pdf");
                IOUtils.copy(book.getToc().getBinaryStream(), out);
                out.flush();
                out.close();
            } 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return null;
    }

    @RequestMapping("/downloadBookSampleChapter/{bookNo}")
    public String downloadBookSampleChapter(@PathVariable("bookNo") Integer bookNo, HttpServletResponse response) {
        Book book = bookService.getBookById(bookNo);
        try {
            if (book.getSampleChapter()!=null) {
                response.setHeader("Content-Disposition", "inline;filename=\"" +book.getBookName()+ "\"");
                OutputStream out = response.getOutputStream();
                response.setContentType("application/pdf");
                IOUtils.copy(book.getSampleChapter().getBinaryStream(), out);
                out.flush();
                out.close();
            } 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return null;
    }
   
//    @RequestMapping(value = "/saveBook", method = RequestMethod.POST)
//    public String saveBook(Map<String, Object> map, @ModelAttribute("book") Book book, @Valid Book bookValid, BindingResult result, @RequestParam("coverPageFile") MultipartFile coverPageFile, @RequestParam("tocFile") MultipartFile tocFile, @RequestParam("sampleChapterFile") MultipartFile sampleChapterFile) throws ArithmeticException, IOException  {
//        if (result.hasErrors()) {
//            map.put("bookList", bookService.listBook());
//            map.put("publisherList", publisherService.listPublisher());
//            map.put("categoryList", categoryService.listCategory());
//            map.put("authorList", authorService.listAuthor());
//            //map.put("errMsg", ex);
//            return "manageBooks";
//        } else {
//            
////           boolean excp =true; 
////           if(excp){        
////           throw new ArithmeticException("hahahahahahahahaha");
////           }
////                       
//            if(!coverPageFile.isEmpty()) {
//                book.setCoverPage(commonService.getBlob(coverPageFile.getBytes()));
//            }
//            else {
//                if (book.getBookNo() != null) {
//                    book.setCoverPage(bookService.getBookById(book.getBookNo()).getCoverPage());
//                }
//            }
//            if(!tocFile.isEmpty()) {
//                book.setToc(commonService.getBlob(tocFile.getBytes()));
//            }
//            else {
//                if (book.getBookNo() != null) {
//                    book.setToc(bookService.getBookById(book.getBookNo()).getToc());
//                }
//            }
//            if(!sampleChapterFile.isEmpty()) {               
//                book.setSampleChapter(commonService.getBlob(sampleChapterFile.getBytes()));
//            }
//            else {
//                if (book.getBookNo() != null) {
//                    book.setSampleChapter(bookService.getBookById(book.getBookNo()).getSampleChapter());
//                }
//            }
//            
//            bookService.saveBook(book);                
//           bookService.notifyCustomersByMail(book); 
//         
//            return "manageBooks";            
//      
//        }
//    }

    @RequestMapping("/deleteBook/{bookNo}")
    public String deleteBook(@PathVariable("bookNo") Integer bookNo) {
        bookService.removeBook(bookNo);
        return "redirect:/admin/manageBooks";
    }
    
    
    @RequestMapping("/editBook/{bookNo}")
    public String editBook(Map<String, Object> map, @PathVariable("bookNo") Integer bookNo) {
        map.put("book", bookService.getBookById(bookNo));
        map.put("publisherList", publisherService.listPublisher());
        map.put("categoryList", categoryService.listCategory());
        map.put("authorList", authorService.listAuthor());
        return "manageBooks";
    }
    
    //------------------------------------it can be remove wil no effect ----just change request to saveBook-----------------------------------------------------------
    
    @ModelAttribute("bookList")
    public List<Book> getBookList(){               
        return bookService.listBook();
    }
  
    @ModelAttribute("book")
    public List<Book> getBookListm(){               
        return bookService.listBook();
    }
    
    @ModelAttribute("publisherList")
    public List getPublisherList(){
        List publisherList = publisherService.listPublisher();        
        return publisherList;
    }
     
    @ModelAttribute("categoryList")
    public List getCategoryList(){
        List categoryList = categoryService.listCategory();        
        return categoryList;
    } 
    
    @ModelAttribute("authorList")
    public List getAuthorList(){
        List authorList = authorService.listAuthor();        
        return authorList;
    }
    
    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("book") Book book1, @Valid Book bookValid, BindingResult result, @RequestParam("coverPageFile") MultipartFile coverPageFile, @RequestParam("tocFile") MultipartFile tocFile, @RequestParam("sampleChapterFile") MultipartFile sampleChapterFile, Model model) throws ArithmeticException, IOException  {
        if (result.hasErrors()) {
            //model.addAttribute("errMsg", "There is Something went wrong!");
            return "manageBooks";
        } else {
            
           
            if(!coverPageFile.isEmpty()) {
                book1.setCoverPage(commonService.getBlob(coverPageFile.getBytes()));
            }
            else {
                if (book1.getBookNo() != null) {
                    book1.setCoverPage(bookService.getBookById(book1.getBookNo()).getCoverPage());
                }
            }
            if(!tocFile.isEmpty()) {
                book1.setToc(commonService.getBlob(tocFile.getBytes()));
            }
            else {
                if (book1.getBookNo() != null) {
                    book1.setToc(bookService.getBookById(book1.getBookNo()).getToc());
                }
            }
            if(!sampleChapterFile.isEmpty()) {               
                book1.setSampleChapter(commonService.getBlob(sampleChapterFile.getBytes()));
            }
            else {
                if (book1.getBookNo() != null) {
                    book1.setSampleChapter(bookService.getBookById(book1.getBookNo()).getSampleChapter());
                }
            }
            
            bookService.saveBook(book1); 
            
            //bookService.notifyCustomersByMail(book1);  //this method is used for emailing
            model.addAttribute("bookList", bookService.listBook());
         
            return "manageBooks";            
      
        }
    }  
    
    
    
    
   //------------------------------------------------------------------------------------------------------- 
    
    @RequestMapping(value = "/addBook1", method = RequestMethod.POST)
    public void m1() throws ArithmeticException, IOException  {
    
     }
    
    
    
    
    
    
    
    
}
