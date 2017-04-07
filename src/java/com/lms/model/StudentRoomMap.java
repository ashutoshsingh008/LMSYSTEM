package com.lms.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="STU_ROOM_ALLOCATION")
@NamedNativeQuery(       
    name = "call_STUDENTBYADNO",
    query = "CALL STUDENTBYADNO(:adno, :name)",
    resultClass = StudentRoomMap.class
    )
public class StudentRoomMap implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="ID")
    private Integer id;
    
    @Column(name="HOSTEL_ID")
    private Integer hostel_id;
    
    @Column(name="ROOM_ID")
    private Integer room_id;
    
    @Column(name="BED_ID")
    private Integer bed_id;
   
    @Column(name="STU_NAME")
    private String stu_name;

       
    
    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }
    
    public Integer getBed_id() {
        return bed_id;
    }

    public void setBed_id(Integer bed_id) {
        this.bed_id = bed_id;
    }

    public Integer getHostel_id() {
        return hostel_id;
    }

    public void setHostel_id(Integer hostel_id) {
        this.hostel_id = hostel_id;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }
  
}