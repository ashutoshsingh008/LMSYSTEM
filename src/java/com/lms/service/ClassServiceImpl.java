package com.lms.service;

import com.lms.dao.ClassDAO;
import com.lms.model.ManageClass;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("classService")
//@Service
public class ClassServiceImpl implements ClassService{
    
    @Autowired
    private ClassDAO classDAO;
    
    @Transactional
    @Override
    public List<ManageClass> listClass() {
        return classDAO.listClass();
    }
    
    
    @Transactional
    @Override
    public void saveClass(ManageClass Classes) {
        classDAO.saveClass(Classes);
    }
    
    @Transactional
    @Override
    public void removeClass(Integer classId) {
        classDAO.removeClass(classId);
    }

    @Transactional
    @Override
    public ManageClass getClassById(Integer classId) {
        return classDAO.getClassById(classId);
    }

    @Transactional
    @Override
    public ManageClass getClassByName(String className) {
        return classDAO.getClassByName(className);
    }
    
}
