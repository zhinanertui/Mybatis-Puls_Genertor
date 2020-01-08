package com.boxi.demo.js.controller;


import com.boxi.demo.js.entity.Student;
import com.boxi.demo.js.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xsw
 * @since 2018-10-23
 */
@RestController
    @RequestMapping("/js/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @RequestMapping("/list")
    public List<Student> getAll() {
        List<Student> list = studentService.list(null);
        return list;


    }
}
