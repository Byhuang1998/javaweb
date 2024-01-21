package com.byhuang.mvc.mapper;

import com.byhuang.pojo.Brand;
import com.byhuang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User getUserByName(@Param("username") String username);
}
