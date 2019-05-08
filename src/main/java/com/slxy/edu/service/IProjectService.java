package com.slxy.edu.service;

import com.slxy.edu.model.Project;
import com.slxy.edu.model.excel.ExcelProject;
import com.slxy.edu.service.base.IBaseService;

import java.util.List;

public interface IProjectService extends IBaseService<Project> {

    //查询要导出excel的数据
    List<ExcelProject> selectExcel(String cname, String dname, String starttime, String endtime, String tname);

    //导入excel
    int importExcel(List<ExcelProject> list);
}
