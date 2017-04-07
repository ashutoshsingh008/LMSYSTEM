package com.lms.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="MANAGECLASS")
public class ManageClass implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="CLASSID")
    private Integer classId;
    
    @Column(name="CLASSNAME")
    @NotEmpty(message="Class Name is mandatory")
    private String className;   

    
    @OneToMany(cascade= CascadeType.ALL, fetch= FetchType.EAGER)
    @JoinTable(name="ClassSectionMap", joinColumns=@JoinColumn(name="CLASSID"), inverseJoinColumns= @JoinColumn(name="SECID"))   
    private List <ManageSection> sections; 
    
  

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<ManageSection> getSections() {
        return sections;
    }

    public void setSections(List<ManageSection> sections) {
        this.sections = sections;
    }


}
