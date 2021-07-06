package Firtst_Task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public abstract class User_Portal {
    private String name;
    private int phone;
    private String address;
    private String designation;
    private int id;
    private int age;

    enum UserType {
        Student,
        Staff
    }



}



