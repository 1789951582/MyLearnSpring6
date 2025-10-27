package cn.powernode.service;

import cn.powernode.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService {

//    @Resource(name = "studentDaoForMySQL")
    @Resource
    private StudentDao studentDao;

    //不能出现在构造方法上
//    @Resource(name = "studentDaoForMySQL")
//    public StudentService(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

//    @Resource(name = "studentDaoForMySQL")
//    public void setStudentDao(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

    public void deleteStudent(){
        studentDao.deleteById();
    }
}
