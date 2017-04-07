package com.lms.service;


import com.lms.model.ManageClass;
import java.util.List;



public interface ClassService {    
public List<ManageClass> listClass();
public void saveClass(ManageClass Classes);
public void removeClass(Integer classId);
public ManageClass getClassById(Integer classId);
public ManageClass getClassByName(String className);

}
