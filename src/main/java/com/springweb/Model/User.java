package com.springweb.Model;

public class User
{
    private int Id;
    private String name;
    private String surname;

    public User(int Id, String name, String surname)
    {
        this.Id = Id;
        this.name = name;
        this.surname = surname;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }
}
