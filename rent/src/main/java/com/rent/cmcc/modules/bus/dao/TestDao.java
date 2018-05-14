package com.rent.cmcc.modules.bus.dao;

import com.rent.cmcc.modules.bus.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TestDao {
        Test findByName(@Param("name") String name);

}
