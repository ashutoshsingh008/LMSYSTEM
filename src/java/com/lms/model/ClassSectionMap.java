package com.lms.model;

import javax.persistence.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="CLASSSECTIONMAP")
public class ClassSectionMap implements java.io.Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="IDX")
    private Integer iDx;
    @NotFound(action=NotFoundAction.IGNORE)
    @ManyToOne
    @JoinColumn(name="CLASSID")
    private ManageClass manageClass;
    
    @NotFound(action=NotFoundAction.IGNORE)
    @ManyToOne
    @JoinColumn(name="SECID")
    private ManageSection manageSection;
    
    
    

    public Integer getiDx() {
        return iDx;
    }

    public void setiDx(Integer iDx) {
        this.iDx = iDx;
    }


    public ManageClass getManageClass() {
        return manageClass;
    }

    public void setManageClass(ManageClass manageClass) {
        this.manageClass = manageClass;
    }

    public ManageSection getManageSection() {
        return manageSection;
    }

    public void setManageSection(ManageSection manageSection) {
        this.manageSection = manageSection;
    }
  
}
