package com.my.dao;

import com.my.vo.Attendance;


import java.util.List;

public interface AttendanceDao {
    List<Attendance>queryAllAttendance();
    int insertAttendance(Attendance attendance);
    int updateAttendance(Attendance attendance);
    Attendance queryAttendanceById(int aid);
    int deleteAttendanceById(int aid);
}
