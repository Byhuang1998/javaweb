package com.byhuang.mvc.mapper;

import com.byhuang.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BrandMapper {

    List<Brand> selectAllBrands();
}
