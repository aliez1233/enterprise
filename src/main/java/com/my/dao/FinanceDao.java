package com.my.dao;

import com.my.vo.Finance;

import java.util.List;

public interface FinanceDao {
    List<Finance> queryAllFinance();
    int insertFinance(Finance finance);
    int updateFinance(Finance finance);
    Finance queryFinanceById(int fid);
    int deleteFinanceById(int fid);
}
