package com.lms.service;

import com.lms.model.User;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;


public interface UserService {
    @PreAuthorize ("hasAnyRole('ROLE_ADMIN')")
    public void saveUser(User User);
    
    @PreAuthorize ("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public List<User> listUser();
    public void removeUser(Integer userNo);
    public User getUserById(Integer userNo);
    public User getUserByUsername(String userName);
}
