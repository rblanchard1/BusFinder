package com.buslocator.www.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.buslocator.www.model.User;

public class UserDao {
	 
    private static final Map<String, User> userMap = new HashMap<String, User>();

 
    public static User getUser(String userId) {
        return userMap.get(userId);
    }
 
    public static User addUser(User user) {
    	userMap.put(user.getUserId(), user);
        return user;
    }
 
    public static User updateUser(User user) {
    	userMap.put(user.getUserId(), user);
        return user;
    }
 
    public static void deleteUser(String userId) {
    	userMap.remove(userId);
    }
 
    public static List<User> getAllUsers() {
        Collection<User> c = userMap.values();
        List<User> list = new ArrayList<User>();
        list.addAll(c);
        return list;
    }
}
