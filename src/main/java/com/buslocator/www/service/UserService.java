package com.buslocator.www.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.buslocator.www.dao.UserDao;
import com.buslocator.www.model.User;

@Path("/users")
public class UserService {
 
    // URI:
    // /contextPath/servletPath/users
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<User> getUsers_JSON() {
        List<User> listOfUsers = UserDao.getAllUsers();
        return listOfUsers;
    }
 
    // URI:
    // /contextPath/servletPath/users/{userId}
    @GET
    @Path("/{userId}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public User getUser(@PathParam("userId") String userId) {
        return UserDao.getUser(userId);
    }
 
    // URI:
    // /contextPath/servletPath/users
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public User addUser(User user) {
        return UserDao.addUser(user);
    }
 
    // URI:
    // /contextPath/servletPath/users
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public User updateEmployee(User user) {
        return UserDao.updateUser(user);
    }
    
    // URI:
    // /contextPath/servletPath/users/{userId}
    @DELETE
    @Path("/{userId}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteUser(@PathParam("userId") String userId) {
        UserDao.deleteUser(userId);
    }
 
}
