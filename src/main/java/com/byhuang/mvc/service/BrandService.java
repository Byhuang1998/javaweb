package com.byhuang.mvc.service;

import com.byhuang.mvc.mapper.BrandMapper;
import com.byhuang.mvc.util.SqlSessionFactoryUtil;
import com.byhuang.pojo.Brand;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandService {

    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.sqlSessionFactory;

    public List<Brand> selectAllBrands() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        List<Brand> brands = mapper.selectAllBrands();
        sqlSession.close();
        return brands;
    }
}
