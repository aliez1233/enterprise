package com.my.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.service.AttendanceService;
import com.my.vo.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/attendance")
@Controller
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @RequestMapping("/allAttendance")
    public String queryAllAttendance(@RequestParam(name = "pn", defaultValue = "1") Integer pn, Model model) {
        PageHelper.startPage(pn, 10);
        List<Attendance> attendances=attendanceService.queryAllAttendance();
        PageInfo pageInfo = new PageInfo(attendances);
        model.addAttribute("pageInfo", pageInfo);
        return "redirect:allAttendance";
    }
    @RequestMapping("/toAddAttendance")
    public String toAddAttendance(){
        return "redirect:addAttendance";
    }
    @RequestMapping("/addAttendance")
    public String addAttendance(Attendance attendance){
        attendanceService.insertAttendance(attendance);
        return "redirect:allAttendance";
    }
    @RequestMapping("/toUpdateAttendance")
    public String toUpdateAttendance(Integer aid,Model model){
        Attendance attendance=attendanceService.queryAttendanceById(aid);
        model.addAttribute("attendance",attendance);
        return "redirect:updateAttendance";
    }
    @RequestMapping("/updateAttendance")
    public String updateAttendance(Attendance attendance){
        attendanceService.updateAttendance(attendance);
        return "redirect:allAttendance";
    }
    @RequestMapping("/delete/{aid}")
    public String deleteAttendance(@PathVariable("aid")Integer aid){
        attendanceService.deleteAttendanceById(aid);
        return "redirect:/attendance/allAttendance";
    }
}
