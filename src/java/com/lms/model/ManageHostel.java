package com.lms.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

//@NamedNativeQueries({
//	@NamedNativeQuery(
//	name = "getHosteldDetails",
//        query = "SELECT h.hostel_id, h.hostel_name, h.description, r.room_name, r.description AS roomDesc FROM hostelmaster h JOIN hostel_room_map hr ON h.hostel_id=hr.hostel_id JOIN roommaster r ON r.room_id=hr.room_id",
//        resultClass = ManageHostel.class
//	)
//})



@Entity
@Table(name="HOSTELMASTER")
//@Cache(region = "messages", usage = CacheConcurrencyStrategy.READ_WRITE)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings("serial")
public class ManageHostel implements Serializable {
  
  
    @Id
    @GeneratedValue
    @Column(name="HOSTEL_ID")
    
    private Integer hostel_id;
    
    @Basic(optional = false)
    @XmlElement(name = "HOSTEL_NAME", required = true)
    @Column(name="HOSTEL_NAME")
    @NotEmpty(message="HOSTEL NAME Name is mandatory")
    private String hostel_name;   
    
    @Basic(optional = false)
    @XmlElement(name = "HOSTEL_DESCRIPTION", required = true)
    @NotEmpty(message="HOSTEL description is mandatory")
    @Column(name="DESCRIPTION")
    private String description;


    //@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @LazyCollection(LazyCollectionOption.FALSE)
    //@JoinTable(name="HOSTEL_ROOM_MAP", joinColumns=@JoinColumn(name="HOSTEL_ID"), inverseJoinColumns= @JoinColumn(name="ROOM_ID"))
    @OneToMany(mappedBy="manageHostel")
    @JsonManagedReference
    @XmlElementWrapper(name = "HOSTEL_ROOMS")
    @XmlElement(name = "ROOM_DETAILS", required = true)
    private List<ManagerRoom> managerRoom;


    
    public ManageHostel() {

    }

    public ManageHostel(String hostel_name, String description) {

        super();
        this.hostel_name = hostel_name;
        this.description = description; 

    }

       
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getHostel_id() {
        return hostel_id;
    }

    
    public void setHostel_id(Integer hostel_id) {
        this.hostel_id = hostel_id;
    }

   
    public String getHostel_name() {
        return hostel_name;
    }

    
    
    public void setHostel_name(String hostel_name) {
        this.hostel_name = hostel_name;
    }

  
    public List<ManagerRoom> getManagerRoom() {
        return managerRoom;
    }

    public void setManagerRoom(List<ManagerRoom> managerRoom) {
        this.managerRoom = managerRoom;
    }
    


    
    
    
    
    
    
    
    
    
}