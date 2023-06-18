package com.my.controller;

import com.github.pagehelper.PageInfo;
import com.my.service.FileService;
import com.my.vo.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/file")
@Controller
public class FileController {
    @Autowired
    private FileService fileService;

    @RequestMapping("/allFile")
    public String queryAllFile(@RequestParam(name = "pn",defaultValue = "1") Integer pn, Model model) {
        List<File> files=fileService.queryAllFile();
        PageInfo pageInfo= new PageInfo(files);
        model.addAttribute("pageInfo",pageInfo);
        return "redirect:allFile";
    }
    @RequestMapping("/toAddFile")
    public String toAddFile(){
        return "redirect:addFile";
    }
    @RequestMapping("/addFile")
    public String addFile(File file){
        fileService.insertFile(file);
        return "redirect:allFile";
    }
    @RequestMapping("/toUpdateFile")
    public String toUpdateFile(Integer fid,Model model){
        File file=fileService.queryFileById(fid);
        model.addAttribute("file",file);
        return "redirect:updateFile";
    }
    @RequestMapping("/updateFile")
    public String updateFile(File file){
        fileService.updateFile(file);
        return "redirect:allFile";
    }
    @RequestMapping("/delete/{fid}")
    public String deleteFile(@PathVariable("fid") Integer fid){
        fileService.deleteFileById(fid);
        return "redirect:/file/allFile";
    }

}
