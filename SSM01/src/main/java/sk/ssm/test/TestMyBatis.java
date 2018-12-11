package sk.ssm.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import sk.ssm.dao.DeptMapper;

import java.io.IOException;
import java.io.InputStream;
/**
 * 测试Mybatis
 * */
public class TestMyBatis {
    public static void main(String[] args) throws IOException {
        String resources="mybatis-config.xml";
        InputStream is= Resources.getResourceAsStream(resources);
        //获取数据库操作工厂
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取实体Mapper映射类
        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
        System.out.println(deptMapper.selectDepts());
    }
}
