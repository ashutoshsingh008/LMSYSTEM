
package com.lms.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement (name="hostels")
public class HostelList implements Serializable 
{
    private static final long serialVersionUID = 1L;
     
    private List<ManageHostel> hostels = new ArrayList<ManageHostel>();

    public List<ManageHostel> getHostels() {
        return hostels;
    }

    public void setHostels(List<ManageHostel> hostels) {
        this.hostels = hostels;
    }
 

}