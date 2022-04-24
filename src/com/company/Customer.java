package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Customer {

    private String name;
    public LocalDate birthday;

    public Integer calculateAge (){
        LocalDate actualDate = LocalDate.now();

        int age = Period.between(this.birthday, actualDate).getYears();
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
