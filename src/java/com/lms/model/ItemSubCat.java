package com.lms.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="ITEM_SUBCAT_MASTER")
public class ItemSubCat implements Serializable {
  
    @Id
    @GeneratedValue
    @Column(name="ITEMSUBCATID")
    private Integer itemSubCatId;
    
    @Column(name="ITEMSUBCATNAME")
    @NotEmpty(message="Item Sub Category Name is mandatory")
    private String itemSubCatName;

    
//   @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
//   //@OnDelete(action= OnDeleteAction.CASCADE)
//   //@Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
//   @JoinTable(name="ITEM_CAT_SUBCAT_MAP", joinColumns=@JoinColumn(name="ITEMSUBCATID"), inverseJoinColumns= @JoinColumn(name="ITEMCATID"))   
//   private List <ItemCat> itemCatMaster;
//    
     
    public Integer getItemSubCatId() {
        return itemSubCatId;
    }

    public void setItemSubCatId(Integer itemSubCatId) {
        this.itemSubCatId = itemSubCatId;
    }

    public String getItemSubCatName() {
        return itemSubCatName;
    }

    public void setItemSubCatName(String itemSubCatName) {
        this.itemSubCatName = itemSubCatName;
    }

//    public List<ItemCat> getItemCatMaster() {
//        return itemCatMaster;
//    }
//
//    public void setItemCatMaster(List<ItemCat> itemCatMaster) {
//        this.itemCatMaster = itemCatMaster;
//    }

   
 
}
