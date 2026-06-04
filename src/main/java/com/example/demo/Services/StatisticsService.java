package com.example.demo.Services;

import org.springframework.stereotype.Service;

@Service
public class StatisticsService {

    private VideoClubServices instance;
    public long count(){
        return instance.getListSize();
    }

}
