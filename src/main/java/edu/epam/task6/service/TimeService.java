package edu.epam.task6.service;

import edu.epam.task6.entity.Time;

public class TimeService {
    public Time getTime(int seconds) {
        int hh = seconds / 3600;
        int mm = (seconds - hh * 3600) / 60;
        int ss = seconds % 60;
        return new Time(hh, mm ,ss);
    }
}
