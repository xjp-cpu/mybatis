package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.javassist.runtime.Desc;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class test {
    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        System.out.println( mapper.selectByPrimaryKey(3));
//        System.out.println("-------------------");
          EmpExample empExample = new EmpExample();
//        System.out.println(mapper.countByExample(empExample));
//        System.out.println("--------------------");
//        System.out.println(mapper.updateByPrimaryKey(new Emp(13,"美女","121212","女",null,null,null)));
//        System.out.println("==================");
//        empExample.createCriteria().andEmpNameBetween("王五","田七");
//        System.out.println(mapper.selectByExample(empExample));

//        System.out.println("=========================");
//        EmpExample empExample2 = new EmpExample();
//        empExample.createCriteria().andAgeEqualTo(22);
//        empExample2.or().andEmpNameEqualTo("沙雕");
//        System.out.println(empExample2);
//        EmpExample empExample2 = new EmpExample();
//       empExample2.createCriteria().andEmpNameEqualTo("田七").andAgeEqualTo(22);
////       empExample2.or().andAgeEqualTo(21);
//        System.out.println(mapper.deleteByExample(empExample2));
//        EmpExample empExample= new EmpExample();
//
//        empExample.setOrderByClause("did ASC,age ASC");
//        mapper.selectByExample(empExample);

        Page<Object> objects = PageHelper.startPage(2, 3);

//         objects.forEach(System.out::println);
//
//        System.out.println(mapper.selectByExample(null));

        List<Emp> emps = mapper.selectByExample(null);
        PageInfo<Emp> empPageInfo = new PageInfo<>(emps, 3);
        System.out.println(empPageInfo);


    }
}
