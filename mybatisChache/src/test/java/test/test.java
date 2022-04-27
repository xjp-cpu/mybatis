package test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;


public class test {


@Test
    public void selectTest() throws Exception {
    InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
    SqlSession sqlSession = sqlSessionFactory.openSession(true);

   EmpMapper mapper= sqlSession.getMapper(EmpMapper.class);

    Emp emp = mapper.selectByPrimaryKey(31);
    System.out.println(emp);

//  int num= mapper.insert(new Emp(null,"沙雕","12345","男",21,"123@qq.com"));
//   System.out.println(num);

}
}