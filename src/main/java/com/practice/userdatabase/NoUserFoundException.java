package com.practice.userdatabase;

public class NoUserFoundException  extends Exception{

    public NoUserFoundException(long id) {
        super(String.format("user is not found with id : '%s'", id));
        }
}
