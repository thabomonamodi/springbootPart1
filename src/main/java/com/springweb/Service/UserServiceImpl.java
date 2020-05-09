package com.springweb.Service;

import com.springweb.Dao.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
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
