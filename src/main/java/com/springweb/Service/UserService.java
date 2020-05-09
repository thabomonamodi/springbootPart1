package com.springweb.Service;

public interface UserService
{
    void addUser(String name, String surname);
    void removeUser(int id);
    void getUser(int id);
}
