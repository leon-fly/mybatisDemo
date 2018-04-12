package com.leon.mybatisdemo.demo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.leon.mybatisdemo.dto.People;
import com.leon.mybatisdemo.mapper.PeopleMapper;

public class AnnotationWayMainDemo {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		
		//查询 - 注解方式
		PeopleMapper pmapper = session.getMapper(PeopleMapper.class);
		People testleon2 = pmapper.queryPeople(1);
		System.out.println(testleon2);
	}
}
