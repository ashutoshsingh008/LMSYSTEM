package com.lms.service;

import com.lms.dao.ManageHostelDAO;
import com.lms.model.ManageHostel;
import com.lms.model.ManagerRoom;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("manageHostelService")
//@Service
public class ManageHostelServiceImpl implements ManageHostelService{

    @Autowired
    private ManageHostelDAO  manageHostelDAO;
    
    //@Autowired
    //public CacheManager cacheManager;

    @Transactional
    @Override    
    public List<ManageHostel> listAllHostel() {
        
        List<ManageHostel> mhList = manageHostelDAO.listAllHostel(); 
        
//        Iterator<ManageHostel> itr = mhList.iterator();
//          while(itr.hasNext()){
//          ManageHostel mh = itr.next();
////        System.out.println(mh.getHostel_name()+"++++++++++++++");
////        List<ManagerRoom> mrList = mh.getManagerRoom();
////        Iterator<ManagerRoom> itr1 = mrList.iterator();
////        while(itr1.hasNext()){
////        ManagerRoom mr = itr1.next();
////        
////        System.out.println(mr.getDescription()+"--------------");
////        }
//          Hibernate.initialize(mh.getManagerRoom());        
//        }
               
        return mhList;
        
    }
 

}
