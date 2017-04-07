package com.lms.dao;

import com.lms.model.ManageClass;
import java.util.List;

public interface ClassDAO {

    public List<ManageClass> listClass();
    //public List<ManageClass> listAllSection(Integer classId);
    public void saveClass(ManageClass Classes);
    public void removeClass(Integer classId);
    public ManageClass getClassById(Integer classId);
    public ManageClass getClassByName(String className);
    
}
