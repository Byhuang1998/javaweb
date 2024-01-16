package com.byhuang.test;

import com.byhuang.mvc.mapper.BrandMapper;
import com.byhuang.mvc.service.BrandService;
import com.byhuang.mvc.util.SqlSessionFactoryUtil;
import com.byhuang.pojo.Brand;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        BrandService service = new BrandService();
        List<Brand> brands = service.selectAllBrands();
        System.out.println(brands);
    }
}
