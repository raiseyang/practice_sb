package com.raise.mapper;

import com.raise.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * mybatis官网教程(http://www.mybatis.org/mybatis-3/zh/getting-started.html)
 */
@Component
@Mapper
public interface UserMapper {


    @Insert("INSERT INTO USER(gender, mobile, email, realname, nickname, " +
            "avatar, job, company, bio, blog, github) " +
            "VALUE(#{gender}, #{mobile}, #{email}, #{realname}, #{nickname}, " +
            "#{avatar}, #{job}, #{company}, #{bio}, #{blog}, #{github})")
    int createUser(User user);

    @Select("SELECT * FROM USER WHERE userid = #{userid}")
    User queryUserById(@Param("userid") int userid);
}
