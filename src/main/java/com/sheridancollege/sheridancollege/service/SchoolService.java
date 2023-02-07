package com.sheridancollege.sheridancollege.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sheridancollege.sheridancollege.dto.School;

@Service
public class SchoolService {
    
    ArrayList<School> list = new ArrayList<>();

    public ArrayList<School> addSchool(School school){
         
        list.add(school);
        System.out.println(list);
        return list;
    }

    public ArrayList<School> getAllSchools(){
        return list;
    }
}
