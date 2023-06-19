package com.my.service;

import com.my.vo.Attendance;


import java.util.List;

public interface AttendanceService {
    List<Attendance> queryAllAttendance();
    int insertAttendance(Attendance attendance);
    int updateAttendance(Attendance attendance);
    Attendance queryAttendanceById(int aid);
    int deleteAttendanceById(int aid);
}
