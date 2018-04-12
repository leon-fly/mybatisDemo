package com.leon.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Select;

import com.leon.mybatisdemo.dto.People;

public interface PeopleMapper {
	@Select("SELECT * FROM people WHERE id = #{id}")
	People queryPeople(int id);
}
