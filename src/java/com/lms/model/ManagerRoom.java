package com.lms.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="ROOMMASTER")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ManagerRoom implements Serializable {
  
    @Id
    @GeneratedValue
    @Column(name="ROOM_ID")
    private Integer room_id;
    
    @Column(name="ROOM_NAME")
    @NotEmpty(message="ROOM NAME Name is mandatory")
    private String room_name;   
    
    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="FLOOR")
    private String floor;

    @Override
    public String toString() {
        return "ManagerRoom{" + "room_id=" + room_id + ", room_name=" + room_name + ", description=" + description + ", floor=" + floor + '}';
    }
    
    
    @ManyToOne
    @JoinColumn(name="HOSTEL_ID")
    @JsonBackReference
    @XmlTransient
    private ManageHostel manageHostel;
    
    //@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    //@LazyCollection(LazyCollectionOption.FALSE)
    //@JoinTable(name="HOSTEL_ROOM_MAP", joinColumns=@JoinColumn(name="ROOM_ID"), inverseJoinColumns= @JoinColumn(name="HOSTEL_ID"))
    //private ManageHostel manageHostel;

    //public ManageHostel getManagerHostel() {
    //return manageHostel;
    //}

    //public void setManagerHostel(ManageHostel managerHostel) {
    //    this.manageHostel = managerHostel;
    //}

    public ManageHostel getManageHostel() {
        return manageHostel;
    }

    public void setManageHostel(ManageHostel manageHostel) {
        this.manageHostel = manageHostel;
    }


    
     public ManagerRoom(){}

    public ManagerRoom(String room_name, String description, String floor) {

        super();
        this.room_name = room_name;
        this.description = description;
        this.floor = floor;

    }

    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
 
    
}