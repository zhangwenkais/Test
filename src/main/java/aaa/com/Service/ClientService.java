package aaa.com.Service;

import aaa.com.Entity.Client;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
//@Repository
@Service
public interface ClientService {

    public Client Login(String cusName, String pwd);

    public int Zhuce(Client client);

    List<Client> findById(Integer cus_id);

    public Integer UpdatePwd(String pwd);

    public Integer UpdateUser(Client client);


    //后台分页查询，修改状态
    PageInfo<Client> showPageInfo(Integer pageNum, Integer pageSize);

    List<Client> listAll();

    Integer update(Client client);
}
