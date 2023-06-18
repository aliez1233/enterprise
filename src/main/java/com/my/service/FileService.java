package com.my.service;

import com.my.vo.File;

import java.util.List;

public interface FileService {
    List<File> queryAllFile();
    int insertFile(File file);
    int updateFile(File file);
    File queryFileById(int fid);
    int deleteFileById(int fid);
}
