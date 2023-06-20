package com.my.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.service.FinanceService;
import com.my.vo.Finance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/finance")
@Controller
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    @RequestMapping("/allFinance")
    public String queryAllFinance(@RequestParam(name = "pn", defaultValue = "1") Integer pn, Model model) {
        PageHelper.startPage(pn, 10);
        List<Finance> finances=financeService.queryAllFinance();
        PageInfo pageInfo = new PageInfo(finances);
        model.addAttribute("pageInfo", pageInfo);
        return "redirect:allFinance";
    }

    @RequestMapping("/toAddFinance")
    public String toAddFinance(){
        return "redirect:addFinance";
    }

    @RequestMapping("/addFinance")
    public String addFinance(Finance finance){
        financeService.insertFinance(finance);
        return "redirect:allFinance";
    }

    @RequestMapping("/toUpdateFinance")
    public String toUpdateFinance(Integer fid,Model model){
        Finance finance=financeService.queryFinanceById(fid);
        model.addAttribute("finance",finance);
        return "redirect:updateFinance";
    }

    @RequestMapping("/updateFinance")
    public String updateFinance(Finance finance){
        financeService.updateFinance(finance);
        return "redirect:allFinance";
    }

    @RequestMapping("/delete/{FinanceId}")
    public String deleteFinance(@PathVariable("FinanceId")Integer fid){
        financeService.deleteFinanceById(fid);
        return "redirect:/finance/allFinance";

    }
}
