package aaa.com.Dao;

import aaa.com.Entity.Client;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface ClientDao {
    @Select("select * from client where cusName = #{param1} and pwd = #{param2}")
    public Client Login(String cusName, String pwd);
    @Insert("insert into client(cusName,pwd,telphone) values(#{cusName},#{pwd},#{telphone})")
    public int Zhuce(Client client);

    List<Client> findById(Integer cus_id);

    public Integer UpdatePwd(String pwd);

    public Integer UpdateUser(Client client);


    //后台分页查询，修改状态
    PageInfo<Client> showPageInfo(Integer pageNum, Integer pageSize);

    List<Client> listAll();

    Integer update(Client client);


}
