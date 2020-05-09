package com.springweb.Dao;

import com.springweb.Model.User;

import java.util.HashMap;
import java.util.Map;

public class FakeRepo implements FakeRepoInterface
{
    private static Map<Integer, User> user = new HashMap<Integer, User>();
    User user1;
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


    @Override
    public void insertUser(int id, String name, String surname)
    {
        user.put(user1.getId(), (User) user);
    }

    @Override
    public void findUserById(int id)
    {
        this.user.get(id);
    }

    @Override
    public void deleteUser(int id)
    {
        this.user.remove(id);
    }
}
