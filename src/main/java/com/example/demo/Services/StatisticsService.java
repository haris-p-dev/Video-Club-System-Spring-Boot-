package com.example.demo.Services;

import org.springframework.stereotype.Service;

@Service
public class StatisticsService {

    private final VideoClubService videoClubService;

    public StatisticsService(VideoClubService videoClubService) {
        this.videoClubService = videoClubService;
    }

    public long count() {
        return videoClubService.size();
    }


}
