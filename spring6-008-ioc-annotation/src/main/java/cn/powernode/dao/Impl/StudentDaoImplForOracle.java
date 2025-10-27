package cn.powernode.dao.Impl;

import cn.powernode.dao.StudentDao;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImplForOracle implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("Oracle正在删除student。。。");
    }
}
