package com.lms.model;
import java.util.*;
import javax.persistence.*;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="MANAGESECTION")
public class ManageSection implements java.io.Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="SECID")
    private Integer secId;
    
    @Column(name="SECNAME")
    @NotEmpty(message="Section Name is mandatory")
    private String secName;
    

    public Integer getSecId() {
        return secId;
    }

    public void setSecId(Integer secId) {
        this.secId = secId;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }


}
