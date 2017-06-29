package br.com.cwi.dojokotlin;

import java.util.Date;

public class Author {

    private String name;
    private String gender;
    private Date birth;
    private Date death;
    private Boolean flag;

    public Author(String name, String gender, Date birth, Date death) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.death = death;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public Date getDeath() {
        return death;
    }

    public void setDeath(Date death) {
        this.death = death;
    }
}
