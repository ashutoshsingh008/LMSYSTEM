package com.lms.dao;
import com.lms.model.User;
import java.util.List;

public interface UserDAO {
    
    public List<User> listUser();
    public void removeUser(Integer userNo);
    public void saveUser(User User);
    public User getUserById(Integer userNo);
    public User getUserByUserName(String userName);
}
