
package com.lms.service;

import com.lms.dao.ManagerRoomDAO;
import com.lms.model.ManagerRoom;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service("managerRoomService")
//@Service
public class ManagerRoomServiceImpl implements ManagerRoomService{

    @Autowired
    private ManagerRoomDAO  managerRoomDAO;
    
    @Transactional
    @Override
    public List< ManagerRoom> listAllRoom() {
        return managerRoomDAO.listAllRoom();
    }

}
