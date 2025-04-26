package com.example.RecruitmentAgency.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PostgressConnection {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void CreateTable(){
        String sql= "CREATE TABLE candidates (id SERIAL PRIMARY KEY,first_name VARCHAR(50),last_name VARCHAR(50), birth_date DATE, email VARCHAR(100) UNIQUE, phone VARCHAR(15), resume TEXT, application_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, status VARCHAR(20)); ";
        jdbcTemplate.execute(sql);
    }

}
