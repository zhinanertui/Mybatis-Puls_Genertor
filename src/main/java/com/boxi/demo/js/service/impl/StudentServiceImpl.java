package com.boxi.demo.js.service.impl;

import com.boxi.demo.js.entity.Student;
import com.boxi.demo.js.mapper.StudentMapper;
import com.boxi.demo.js.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xsw
 * @since 2018-10-23
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
