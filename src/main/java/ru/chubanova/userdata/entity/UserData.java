package ru.chubanova.userdata.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UserData {
    @Id
    private Integer id;
    private String name;
    private String docNum;
    private String phone;

}
