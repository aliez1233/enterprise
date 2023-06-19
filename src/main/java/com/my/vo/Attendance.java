package com.my.vo;

public class Attendance {
    private Integer AttendanceId;
    private Integer EmployeeId;
    private String EmployeeName;
    private String Appear;
    private String Leave;
    private String LateEarlyLeave;
    private String AbsentWork;
    private String Overtime;

    public Integer getAttendanceId() {
        return AttendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        AttendanceId = attendanceId;
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getAppear() {
        return Appear;
    }

    public void setAppear(String appear) {
        Appear = appear;
    }

    public String getLeave() {
        return Leave;
    }

    public void setLeave(String leave) {
        Leave = leave;
    }

    public String getLateEarlyLeave() {
        return LateEarlyLeave;
    }

    public void setLateEarlyLeave(String lateEarlyLeave) {
        LateEarlyLeave = lateEarlyLeave;
    }

    public String getAbsentWork() {
        return AbsentWork;
    }

    public void setAbsentWork(String absentWork) {
        AbsentWork = absentWork;
    }

    public String getOvertime() {
        return Overtime;
    }

    public void setOvertime(String overtime) {
        Overtime = overtime;
    }

    public Attendance() {
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "AttendanceId=" + AttendanceId +
                ", EmployeeId=" + EmployeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", Appear='" + Appear + '\'' +
                ", Leave='" + Leave + '\'' +
                ", LateEarlyLeave='" + LateEarlyLeave + '\'' +
                ", AbsentWork='" + AbsentWork + '\'' +
                ", Overtime='" + Overtime + '\'' +
                '}';
    }

    public Attendance(Integer attendanceId, Integer employeeId, String employeeName, String appear, String leave, String lateEarlyLeave, String absentWork, String overtime) {
        AttendanceId = attendanceId;
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        Appear = appear;
        Leave = leave;
        LateEarlyLeave = lateEarlyLeave;
        AbsentWork = absentWork;
        Overtime = overtime;
    }
}
