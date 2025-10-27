package cn.powernode.dao.Impl;

import cn.powernode.dao.StudentDao;
import org.springframework.stereotype.Repository;

//@Repository("studentDaoForMySQL")
@Repository("studentDao1")
public class StudentDaoForMySQL implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("MySQL数据库正在删除学生信息");
    }
}
