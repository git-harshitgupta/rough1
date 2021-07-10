package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Volunter implements Serializable {
    private int id;
    private String name;
    List<String> hobbies;
    boolean isAvaliable;
    LocalDate dob;

    public Volunter(int id, String name, List<String> hobbies, boolean isAvaliable, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
        this.isAvaliable = isAvaliable;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        isAvaliable = avaliable;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Volunter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", isAvaliable=" + isAvaliable +
                ", dob=" + dob +
                '}';
    }
}
