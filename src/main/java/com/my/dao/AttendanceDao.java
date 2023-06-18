package com.my.dao;

import com.my.vo.Attendance;
import com.my.vo.File;

import java.util.List;

public interface AttendanceDao {
    List<Attendance>queryAllAttendance();
    int insertAttendance(Attendance attendance);
    int updateAttendance(Attendance attendance);
    File queryAttendanceById(int aid);
    int deleteAttendanceById(int aid);
}
