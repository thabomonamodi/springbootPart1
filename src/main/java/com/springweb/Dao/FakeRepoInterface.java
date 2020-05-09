package com.springweb.Dao;

import com.springweb.Model.User;
import java.util.Collection;

public interface FakeRepoInterface
{
    void insertUser(int id, String name, String surname);
    void findUserById(int id);
    void deleteUser(int id);
}
