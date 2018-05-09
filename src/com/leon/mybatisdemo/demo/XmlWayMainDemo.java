package com.leon.mybatisdemo.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.leon.mybatisdemo.dto.People;




public class XmlWayMainDemo {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try{
			//插入1条
			session.insert("com.leon.mabatisdemo.mapper.PeopleMapper.insertPeople", new People(1,"张三","M"));
			//查询 - xml方式
			People testleon = session.selectOne("com.leon.mabatisdemo.mapper.PeopleMapper.queryPeople","1");
			System.out.println(testleon);
			//插入多条
			/*People p1 = new People(2, "Leon", "M");
			People p2 = new People(3, "zhang", "M");
			People p3 = new People(4, "Li", "F");
//			People[] peoples = new People[]{p1,p2,p3}; //数组无法作为参数
			ArrayList<People> peoples2 = new ArrayList<People>();
			peoples2.add(p1);
			peoples2.add(p2);
			peoples2.add(p3);
			session.insert("com.leon.mabatisdemo.mapper.PeopleMapper.insertPeoples",peoples2);*/
			
			//更新
			/*People upp1 = new People(1,"updateName","M");
			session.update("com.leon.mabatisdemo.mapper.PeopleMapper.updatePeople", upp1);*/
			
			//删除
			/*People delp1 = new People();
			delp1.setId(2);
			session.delete("com.leon.mabatisdemo.mapper.PeopleMapper.deletePeople",delp1);*/
			
		}finally{
			session.commit();
			session.close();
		}
	}
}
