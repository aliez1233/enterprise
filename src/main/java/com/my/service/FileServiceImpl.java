package com.my.service;

import com.my.dao.FileDao;
import com.my.vo.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FileServiceImpl implements FileService{
    @Autowired
    FileDao fileDao;

    public List<File> queryAllFile(){
        return fileDao.queryAllFile();
    }
    public int insertFile(File file){
        int i =fileDao.insertFile(file);
        return i;
    }
    public int updateFile(File file){
        int i =fileDao.updateFile(file);
        return i;
    }
    public File queryFileById(int fid){
        return fileDao.queryFileById(fid);
    }
    public int deleteFileById(int fid){
        int i=fileDao.deleteFileById(fid);
        return i;
    }
}
