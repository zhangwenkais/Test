package aaa.com.Dao;

import aaa.com.Entity.House_info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HouseDao {

    List<House_info> showHouse(@Param("province") String province, @Param("city") String city, @Param("county") String county);
}
