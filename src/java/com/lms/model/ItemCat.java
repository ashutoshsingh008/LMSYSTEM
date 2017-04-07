package com.lms.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Required;


@Entity
@Table(name="ITEM_CAT_MASTER")

public class ItemCat implements Serializable {
  
    @Id
    @GeneratedValue
    @Column(name="ITEMCATID")
    private Integer itemCatId;
    
   
    @Column(name="ITEMCATNAME")
    @NotEmpty(message="Item Category Name is mandatory")
    private String itemCatName;   
    

//   @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE }) 
//   //@ManyToMany(cascade= CascadeType.ALL, fetch= FetchType.EAGER)
//   @JoinTable(name="ITEM_CAT_SUBCAT_MAP", joinColumns=@JoinColumn(name="ITEMCATID"), inverseJoinColumns= @JoinColumn(name="ITEMSUBCATID"))   
//   private List <ItemSubCat> itemSubCatMaster;

    public Integer getItemCatId() {
        return itemCatId;
    }

    
    public void setItemCatId(Integer itemCatId) {
        this.itemCatId = itemCatId;
    }

    public String getItemCatName() {
        return itemCatName;
    }

    //@Required
   
    public void setItemCatName(String itemCatName) {
        this.itemCatName = itemCatName;
    }

//    public List<ItemSubCat> getItemSubCatMaster() {
//        return itemSubCatMaster;
//    }
//
//    public void setItemSubCatMaster(List<ItemSubCat> itemSubCatMaster) {
//        this.itemSubCatMaster = itemSubCatMaster;
//    }


}
