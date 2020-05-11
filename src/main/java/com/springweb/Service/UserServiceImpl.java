package com.springweb.Service;

import com.springweb.Dao.FakeRepo;
import com.springweb.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService
{
    private static Map<Integer, User> user;

    static
    {
        user = new HashMap<Integer, User>()
        {
            {
                put(1,new User(1,"Zoba","Roidz"));
                put(2,new User(2,"Bling","Dynamo"));
                put(3,new User(3,"Criss","Smart"));
                put(4,new User(4,"Rust","Eze"));
            }
        };
    }

    @Autowired
    private FakeRepo repo;

    @Override
    public void addUser(String name, String surname)
    {
        repo.insertUser(name,surname);
    }

    @Override
    public void removeUser(int id)
    {
        repo.deleteUser(id);
    }

    @Override
    public void getUser(int id)
    {
        repo.findUserById(id);
    }
}
