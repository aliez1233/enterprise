package com.my.service;

import com.my.vo.Finance;

import java.util.List;

public interface FinanceService {
    List<Finance> queryAllFinance();
    int insertFinance(Finance finance);
    int updateFinance(Finance finance);
    Finance queryFinanceById(int fid);
    int deleteFinanceById(int fid);
}
