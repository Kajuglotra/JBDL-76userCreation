package org.gfg.UserCreation;

import lombok.*;

public class UserDTO {
    private String userName;

    private int rollNo;

    public UserDTO(String userName, int rollNo) {
        this.userName = userName;
        this.rollNo = rollNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
